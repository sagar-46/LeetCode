class Solution {
    public boolean isPalindrome(int x) {
        int r = 0;
        int y = x;
        if(x<0){
            return false;
        }
        while(x!=0){
            r = (r*10)+x%10;
            x = x/10;
        }
        if(y==r){
            return true;
        }else{
            return false;
        }
    }
}
