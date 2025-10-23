class Solution {
    public boolean hasSameDigits(String s) {
        int x = 0;
        char [] arr = s.toCharArray();
        while(arr.length - x != 2){
            for(int i = 0;i < arr.length -1 - x;i++){
                arr[i] = (char) (((arr[i] - '0') + (arr[i+1] - '0')) % 10 + '0');
            }
            x++;
        }
        return arr[0] == arr[1];
    }
}
