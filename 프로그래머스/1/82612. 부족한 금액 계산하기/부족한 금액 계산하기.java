class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long longMoney = money;
        for(int i=1; i <= count; i++){

            
            longMoney = longMoney - ((long)price * i);
            
        }
        
        if(longMoney >=0) {
            answer = 0;
        }else{
          answer =   Math.abs(longMoney);
        }
        
        
 

        return answer;
    }
}