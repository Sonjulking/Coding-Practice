class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = new char[s.length()];
        for(int i = 0; i < s.length(); i ++){
            charArray[i] = s.charAt(i);
        }
        
        for(int i = 0; i < charArray.length - 1; i ++){
            for(int j = i + 1; j < charArray.length; j ++ ){
                if(charArray[i] < charArray[j]){
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        answer = String.valueOf(charArray);
        return answer;
    }
}