class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original=x;
        int reversed=0;
        int lastdigit=0;
        while(x>0){
            lastdigit=x%10;
            reversed=reversed*10+lastdigit;
            x=x/10;
        }
        return reversed==original;
        
    }
}