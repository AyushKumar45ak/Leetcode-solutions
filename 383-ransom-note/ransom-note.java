class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char [] arr=ransomNote.toCharArray();
        char [] arr2=magazine.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char c:arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char d:arr2){
            map2.put(d,map2.getOrDefault(d,0)+1);
        }
        for(char e:map.keySet()){
            if(map.get(e)>map2.getOrDefault(e,0)){
                return false;
            }
            
        }
        return true;
    }
}