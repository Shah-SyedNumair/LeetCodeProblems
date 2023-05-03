class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int org = x;
        int remain = 0;
        while (x!=0) {
            remain = remain*10 + x%10;
            x /= 10;
        }
        if(remain == org) return true;
        return false;
    }
}