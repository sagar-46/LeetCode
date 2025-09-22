class Solution {
    public int maxFrequencyElements(int[] nums) {
        byte[] freq = new byte[101];
        int res = 0, max = 0;
        for(int val : nums){
            freq[val]++;
        }
        for(int val : freq){
            max = Math.max(max,val);
        }
        for(int val : freq){
            if(val == max){
                res += max;
            }
        }
        return res;
    }
}
