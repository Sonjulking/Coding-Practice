import java.util.ArrayList; 

class Solution {
    public int[] solution(int[] answers) {
        
        int[] answer;

        int[] one = {1, 2, 3, 4, 5}; 
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5}; 
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] count = {0, 0, 0}; 


        for(int i = 0; i < answers.length; i++){

            if(answers[i] == one[i % one.length]){
                count[0]++;
            }
            if(answers[i] == two[i % two.length]){
                count[1]++;
            }
            if(answers[i] == three[i  % three.length ]){
                count[2]++;
            }
        }


        int maxScore = 0;
        if(maxScore < count[0]){
            maxScore = count[0];
        }
         if(maxScore < count[1]){
            maxScore = count[1];
        }

         if(maxScore < count[2]){
            maxScore = count[2];
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(maxScore ==count[0]){
            arrayList.add(1);
        }
          if(maxScore == count[1]){
            arrayList.add(2);
        }
          if(maxScore == count[2]){
            arrayList.add(3);
        }
        
        answer = new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i ++) {
            answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
}
