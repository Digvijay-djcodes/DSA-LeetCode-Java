class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int low=0,high=k-1;
        long sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        long res=0;
        int l=nums.length;
        for(int x=low;x<=high;x++){
            sum=sum+nums[x];
            map.put(nums[x],map.getOrDefault(nums[x],0)+1);
        }
        while(high<l){
            if(map.size()==(high-low+1)){
                res=Math.max(sum,res);
            }
            sum=sum-nums[low];
            map.put(nums[low],map.get(nums[low])-1);
            if(map.get(nums[low])==0){
                    map.remove(nums[low]);
                }
            low++;
            high++;
            if(high==l){
                break;
            }
            sum=sum+nums[high];
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);

        }
        return res;
    }
}