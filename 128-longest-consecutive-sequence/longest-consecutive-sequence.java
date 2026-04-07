class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums)
        set.add(n);

        int max=0;
        for(int num:set){
            if(set.contains(num-1))
            continue;

            int currentLen=0;
            while(set.contains(num)){
                currentLen+=1;
                num+=1;
            }
            max=Math.max(max,currentLen);

        }
        return max;
        
    }
}