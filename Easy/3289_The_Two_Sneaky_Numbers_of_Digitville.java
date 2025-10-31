class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int j = 0;
        for(int x : nums){
            if(!set.isEmpty() && set.contains(x)){
                ans[j++] = x;
            }else{
                set.add(x);
            }
        }
        return ans;
    }
}
