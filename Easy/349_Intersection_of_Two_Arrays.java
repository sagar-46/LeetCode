class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> map = new HashSet<>();
        for(int n : nums1){
            map.add(n);
        }
        List<Integer> result = new ArrayList<>();
        for(int n : nums2){
            if(map.contains(n)){
                result.add(n);
                map.remove(n);
            }
        }
        int [] ans = new int[result.size()];
        for(int i = 0; i < result.size();i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}
