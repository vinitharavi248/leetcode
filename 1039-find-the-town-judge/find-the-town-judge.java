class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustsGiven = new int[n + 1];
        int[] trustsReceived = new int[n + 1];
        for (int[] t : trust) {
            trustsGiven[t[0]]++;
            trustsReceived[t[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (trustsGiven[i] == 0 && trustsReceived[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
