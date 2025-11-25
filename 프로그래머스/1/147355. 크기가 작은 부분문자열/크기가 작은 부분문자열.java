class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLen = t.length();
        int pLen = p.length();
        int count = tLen - pLen;
        String[] arrStr = new String[count+1];
        for(int i = 0; i <= count; i++){
            arrStr[i] = t.substring(i, i + pLen);
            if(Long.parseLong(arrStr[i]) <= Long.parseLong(p)){
                answer ++;
            }
        }
        
        return answer;
    }
    
}