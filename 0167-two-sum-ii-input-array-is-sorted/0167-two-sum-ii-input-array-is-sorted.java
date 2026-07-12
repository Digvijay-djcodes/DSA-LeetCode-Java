class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=(numbers.length)-1;
        int sum=0;
        int answer[]=new int[2];
        while(left<right){
            sum=numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                answer[0]=left+1;
                answer[1]=right+1;
                return answer;

            }


            

        }
        return answer;
    }
}