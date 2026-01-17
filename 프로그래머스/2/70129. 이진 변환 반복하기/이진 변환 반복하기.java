class Solution {
    public int[] solution(String s) {
        int roof = 0;
        int zeroCount = 0;
        
        while (!s.equals("1")){
            int currentLen = s.length();
            int countOnes = 0;
            
            for(int i = 0; i  < currentLen; i ++){
                if(s.charAt(i) == '0'){
                    zeroCount++;
                }else{
                    countOnes++;
                }
            }
            
            String binary = "";
            int temp = countOnes;
            
            while (temp > 0) {
                int remainder = temp % 2;
                binary = remainder + binary;
                temp /= 2;
            }
            
            s = binary;
            
            roof ++;
            
        }
        
        return new int[] { roof, zeroCount};
    }
}