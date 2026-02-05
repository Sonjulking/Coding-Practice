class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == ' '){
                answer += ch;
                continue;
            }
            
            if(Character.isUpperCase(ch)) {
                char p = (char) (ch +n);
                if(p > 'Z'){
                    p = (char) (p - 26);
                }
                answer += p;
            }else if (Character.isLowerCase(ch)){
                char p = (char) (ch + n);
                if(p >'z'){
                    p = (char) (p - 26);
                }
                answer += p;
            }
            
        
            
        }
        
        return answer;
    }
}