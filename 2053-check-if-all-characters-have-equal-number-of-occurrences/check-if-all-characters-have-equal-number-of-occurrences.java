class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap <Character,Integer> map = new HashMap <> ();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int c=-1;
        for(int num:map.values()){
            if(c == -1){
                c=num;
            }
            else if(c != num){
                return false;
            }
        }
        return true;

      
    }
}