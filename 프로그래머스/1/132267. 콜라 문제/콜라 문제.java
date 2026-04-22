class Solution {
    // a : 줘야되는 병 수
    // b : 마트에서 주는 콜라병 수 
    // n : 가지고 있는 병 수 
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int newCola = (n / a) * b;
            answer += newCola;
            //새로운 콜라 + 교환 못한 병 수 
            n = newCola + (n % a);
        }
        
        return answer;
    }
}