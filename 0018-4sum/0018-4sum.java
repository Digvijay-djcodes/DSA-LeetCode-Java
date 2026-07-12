class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        int i,j,k,l=0;
        long sum=0;
        int n=nums.length;
        for ( i=0;i<=n-4;i++){
            if(i>0 && nums[i]==nums[i-1] && i<=n-4){
                continue;
            }
            for(j=i+1;j<=n-3;j++){
                if(j>i+1 && nums[j]==nums[j-1] && j<=n-3){
                    continue;
                }
                k=j+1;
                l=n-1;
                while(k<l){
                    sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        result.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k],nums[l])));
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(l>k && nums[l]==nums[l+1]){
                            l--;
                        }
                    }

                }


            }
        }

    return result;
        
    }
}