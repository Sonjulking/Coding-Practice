class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] number = new char[phone_number.length()];
        
        for(int i = 0; i < phone_number.length(); i++){
            number[i] = phone_number.charAt(i);
        }
        
        for(int i = 0; i < number.length - 4; i ++){
            number[i] = '*';
        }
        
        answer = String.valueOf(number);
        
        return answer;
    }
}