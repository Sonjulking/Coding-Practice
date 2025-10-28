class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] studentStatus = new int[n + 2];
        
        int answer = n;
        for(int r : reserve){
            studentStatus[r]++;
        }
        
        for(int l : lost){
            studentStatus[l]--;
        }
        
        for(int i = 1; i <= n; i ++){
            if(studentStatus[i] == -1){
                if(studentStatus[i - 1] == 1) {
                    studentStatus[i - 1] = 0;
                    studentStatus[i] = 0;
                    }else if (studentStatus[i + 1] == 1) {
                        studentStatus[i + 1] = 0;
                        studentStatus[i] = 0;
                    } else {
                    answer --;
                }
            }
        } 
        return answer;
    }
}