class Solution {
    public int solution(int n) {
        // 1. 기준이 되는 n의 1의 개수를 계산합니다.
        int targetCount = Integer.bitCount(n);
        
        // 2. n보다 1 큰 수부터 시작하여 무한 루프를 돕니다.
        int nextNumber = n + 1;
        
        while (true) {
            // 3. 다음 숫자의 1의 개수가 targetCount와 같은지 확인합니다.
            if (Integer.bitCount(nextNumber) == targetCount) {
                // 4. 조건을 만족하면 해당 숫자를 반환하고 종료합니다.
                return nextNumber;
            }
            // 5. 조건을 만족하지 않으면 숫자를 1 증가시킵니다.
            nextNumber++;
        }
    }
}