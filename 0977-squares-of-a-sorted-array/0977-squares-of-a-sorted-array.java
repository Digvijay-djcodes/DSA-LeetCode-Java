class Solution {
    public int[] sortedSquares(int[] nums) {
        int i,j;
        i=0;
        j=(nums.length)-1;
        int k=(nums.length)-1;
        int result[]=new int[nums.length];
        while(i<=j){
            if((nums[i]*nums[i])>(nums[j]*nums[j])){
                result[k]=(nums[i]*nums[i]);
                k--;
                i++;
            }
            else{
                result[k]=(nums[j]*nums[j]);
                k--;
                j--;
            }
        }
        return result;
        
    }
}