class Solution {
    public String solution(int[] food) {
        String answer = "";
        String input = "";
        for(int i = 1; i < food.length; i ++ ){
            if(food[i] < 2){
                continue;
            }else{
                int cnt = food[i] / 2;
                for(int j = 0; j < cnt; j++ ){
                    input += i;
                }
            }
        }
        
        answer = input + "0";
        for(int i = input.length() - 1; i >=0; i--){
            answer += input.charAt(i);
        }
        return answer;
        
    }
}