class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = new char[s.length()];
        char[] newCharArray;
        int mid = 0;
        
        for(int i = 0; i < s.length(); i++){
            charArray[i] = s.charAt(i);
        }

        if(s.length() % 2 == 0){
            mid = s.length() / 2;
            newCharArray = new char[2];
            newCharArray[0] = charArray[mid -1]; 
            newCharArray[1] = charArray[mid ]; 
        }else{
            mid = s.length() / 2;
            newCharArray = new char[1];
            newCharArray[0] = charArray[mid]; 
        }
        answer = String.valueOf(newCharArray);
        
        
        
        return answer;
    }
}