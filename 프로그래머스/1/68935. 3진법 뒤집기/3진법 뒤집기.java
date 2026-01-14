class Solution {
    public int solution(int n) {
        String binary = "";
        int temp = n;
        
        //10진수를 3진법 문자열로 변환 하기 
        while (temp > 0) {
            binary = (temp % 3) + binary;
            temp = temp / 3;
        }
        
        char[] binaryArr = binary.toCharArray();
        
        int answer = 0;
        
        for (int i = 0; i < binaryArr.length; i++) {
            int digit = Integer.parseInt(String.valueOf(binaryArr[i]));
            
            answer += digit * (int) Math.pow(3,i);
        }
        
        return answer;
    }
}