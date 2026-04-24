class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Idx = 0;
        int cards2Idx = 0;
        
        for(String target : goal){
            //1.card1에서 단어 찾는 경우 
            if(cards1Idx < cards1.length && cards1[cards1Idx].equals(target)) {
                cards1Idx++;
            }else if(cards2Idx < cards2.length && cards2[cards2Idx].equals(target)){
                cards2Idx++;
            }else{
                 return "No";
            }
        }
        
        return "Yes";
    }

}