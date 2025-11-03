class Solution {
    public long solution(long n) {
        long answer = 0;
        int cnt =0;
        long nCopy = n;
        while(n > 0){
            n = n/10;
            cnt ++;
        }
        long[] list = new long[cnt];
        
        for(int i = 0; i < cnt; i++){
            list[i] = nCopy % 10;
            nCopy /= 10;
        }
        
        
        for(int j = 0; j < cnt -1; j ++ ){
            for (int i = 0; i < cnt- 1; i ++ ){
                if(list[i]  < list[i + 1] ){
                    long temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
        
        int i = 0;
        while(cnt > 0){
            answer = answer * 10 + list[i];
            i++;
            cnt --;
        }
        
        return answer;
    }
}