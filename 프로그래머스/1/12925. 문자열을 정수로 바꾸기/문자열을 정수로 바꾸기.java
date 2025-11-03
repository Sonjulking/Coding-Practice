class Solution {
    public int solution(String s) {
        int answer = 0;
        int sign = 1; // 부호를 저장할 변수 (1: 양수, -1: 음수)
        int startIndex = 0; // 숫자가 시작되는 인덱스

        // 1. 첫 번째 문자를 확인하여 부호 처리
        char firstChar = s.charAt(0);
        if (firstChar == '-') {
            sign = -1;
            startIndex = 1; // 숫자는 두 번째 문자부터 시작
        } else if (firstChar == '+') {
            startIndex = 1; // 숫자는 두 번째 문자부터 시작
        }
        // 부호가 없으면 startIndex는 0, sign은 1로 유지됨

        // 2. 숫자가 시작되는 인덱스부터 끝까지 반복
        for (int i = startIndex; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 3. 문자를 숫자로 변환
            // (예: '1'의 아스키코드 49 - '0'의 아스키코드 48 = 1)
            int digit = c - '0';
            
            // 4. 자릿수를 올리면서 숫자를 누적
            // (예: 1 -> 1*10+2=12 -> 12*10+3=123 -> 123*10+4=1234)
            answer = answer * 10 + digit;
        }

        // 5. 최종 결과에 부호를 곱하여 반환
        return answer * sign;
    }
}