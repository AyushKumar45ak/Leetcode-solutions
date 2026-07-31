class Solution {
    public int minimumPushes(String word) {
        HashMap <Character,Integer> map = new HashMap <> ();
        for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }   
        List <Integer> list = new ArrayList <> (map.values());
        list.sort(Collections.reverseOrder());
        int push=0;
        int ans=0;
        for(int i=0;i<list.size();i++){
            push=(i/8)+1;
            ans=ans+push*list.get(i);
        }
        return ans;

        
    }
}