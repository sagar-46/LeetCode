class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int x = 0;
        for(int i = 0;i < n;i++){
            if(nums[i]!=0){
                nums[x++]=nums[i];
            }
        }
        while(x < n){
            nums[x++]=0;
        }
    }
}
