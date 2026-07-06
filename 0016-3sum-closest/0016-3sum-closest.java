class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int min_diff=Integer.MAX_VALUE;
        int diff=0;
        int res_sum=0;
        int j,k;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            j=i+1;
            k=n-1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    res_sum=sum;
                    min_diff=0;
                    return res_sum;
                }
                if(sum>target){
                    diff=Math.abs(sum-target);
                    if(min_diff>diff){
                        min_diff=diff;
                        res_sum=sum; 
                    }
                    k--;
                }
                if(sum<target){
                    diff=Math.abs(sum-target);
                    if(min_diff>diff){
                        min_diff=diff;
                        res_sum=sum; 
                    }
                    j++;
                }
            }

        }
        return res_sum;

        
    }
}