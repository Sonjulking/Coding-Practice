class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        char[] c = new char[s.length()];
        int pCnt = 0;
        int yCnt = 0;
        for(int i = 0; i < s.length(); i ++) {
           char ch = s.charAt(i);
            if(ch == 'p'){
                pCnt ++;
            }
            if(ch == 'y'){
                yCnt ++;
            }
        }
        
        if(pCnt == yCnt) {
            answer = true; 
        }else{
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}