class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder ();
        ArrayList <Character> list1 = new ArrayList <> ();
        ArrayList <Character> list2 = new ArrayList <> ();
        for(char c:word1.toCharArray()){
            list1.add(c);
        }
        for(char c:word2.toCharArray()){
            list2.add(c);
        }
        int i=0;
        int j=0;
        while(!(list1.isEmpty() || list2.isEmpty())){
            if(i>=0 && i<list1.size()){
               sb.append(list1.remove(i));
            }
             if(j>=0 && j<list2.size()){
               sb.append(list2.remove(j));
            }
        }
        while(!list1.isEmpty() ){
            sb.append(list1.remove(i));
        }
        while(!list2.isEmpty() ){
            sb.append(list2.remove(i));
        }
        return sb.toString();
        
    }
}