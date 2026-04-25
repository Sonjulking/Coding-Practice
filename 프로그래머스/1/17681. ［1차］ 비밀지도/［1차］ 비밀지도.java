class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            //1.두 지도 합치기
            int combined = arr1[i] | arr2[i];
            
            //2.합쳐진 숫자 변환
            //n의 자리수
            char[] row = new char[n];
            
            int temp = combined;
            
            for(int j = n - 1; j >=0; j--){
                if(temp % 2 == 1){
                    row[j] = '#';
                }else{
                    row[j] = ' ';
                }

                // >> 연산이랑 동일
                temp /= 2;
            }
            

            
            answer[i] = new String(row);
            
        }
        

        
        
        return answer;
    }
}