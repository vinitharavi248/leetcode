class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int c=0;
        while(x>0){
            int t=x%10;
            c=c*10+t;
            x/=10;
        }
        if(y==c)return true;
        else
        return false;
    }
}