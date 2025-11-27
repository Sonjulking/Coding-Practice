class Solution {
    public String solution(int a, int b) {
        String[] dayOfWeekArray = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day=0; 
        for(int i=0; i < a - 1; i++){
            day += date[i];  
        }
        day += b;

         String answer = "";
        answer = dayOfWeekArray[day % 7];
        
        
        
       
        return answer;
    }
}