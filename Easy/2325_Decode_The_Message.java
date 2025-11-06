class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character,Character> map = new HashMap<>();
        char a = 'a';
        for(char c : key.toCharArray()){
            if(c != ' ' && !map.containsKey(c)){
                map.put(c,a);
                a++;
            }
        }
        for(char c : message.toCharArray()){
            if(c != ' '){
                ans.append(map.get(c));
            }else{
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
