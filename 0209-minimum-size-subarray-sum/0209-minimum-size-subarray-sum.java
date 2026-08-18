class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        int low=0,high=0,sum=0,windowlength=0;
        int l=nums.length;
        while(high<l){
            sum=sum+nums[high];
            while(sum>=target){
                windowlength=high-low+1;
                res=Math.min(windowlength,res);
                sum=sum-nums[low];
                low++;
            }
            high++;
        }
        if (res==Integer.MAX_VALUE){
            res=0;
        }
        return res;
        
    }
}