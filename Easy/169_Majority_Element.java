class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int cnt = 0;
        for(int n : nums){
            if(cnt == 0){
                c = n;
            }
            if(n == c){
                cnt++;
            }else {
                cnt--;
            }
        }
        return c;
    }
}
