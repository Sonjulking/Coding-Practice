class Solution {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        
        for(int i = 0; i < len - 1; i ++){
            int minIdx = i;
            
            for(int j = i + 1; j < len; j ++){
                char charA = strings[minIdx].charAt(n);
                char charB = strings[j].charAt(n);
                
                if (charA > charB) { 
                    minIdx = j;
                } else if (charA == charB){
                    if(strings[minIdx].compareTo(strings[j])> 0) {
                        minIdx = j;
                    }
                }
                
            }
            String temp = strings[i];
            strings[i] = strings[minIdx];
            strings[minIdx] = temp;
        }
        
        return strings;
    }
}