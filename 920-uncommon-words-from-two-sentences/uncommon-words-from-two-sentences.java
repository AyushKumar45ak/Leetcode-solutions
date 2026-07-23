class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String a=s1+" "+s2;
        String [] arr = a.split(" ");
        ArrayList <String> list = new ArrayList <> ();
        HashMap <String,Integer> map = new HashMap <> ();
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String x:arr){
            if(map.get(x)==1){
                list.add(x);
            }
        }
        String [] ans = new String[list.size()];
        for(int k=0;k<list.size();k++){
            ans[k]=list.get(k);
        }
        return ans;
    }
}