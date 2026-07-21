class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap <String ,Integer> map = new HashMap <> ();
        for(String s:words1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int ans=0;
        int count=0;
        for(String a:words1){
            if(map.get(a)==1){
                for(int i=0;i<words2.length;i++){
                    if(a.equals(words2[i])){
                        count++;
                    }
                }
                
            }
            if(count==1){
                ans++;
            }
            count=0;
        }
        return ans;
    }
}