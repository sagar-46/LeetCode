class Solution {
    public int totalMoney(int n) {
        int q = n/7;
        int ans = 0;
        for(int i = 1; i <= q;i++){
            ans += 7*(i+3);
        }
        for(int i = 7*q; i < n ; i++){
            ans += ++q;
        }
        return ans;
    }
}
