class Solution {
    public int fib(int n) {
        int sum=0;
        int prev=1;
        int slast=0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        for(int i=2;i<=n;i++){
            sum=prev+slast;
            slast=prev;
            prev=sum;
        }
        return sum;
        
    }
}