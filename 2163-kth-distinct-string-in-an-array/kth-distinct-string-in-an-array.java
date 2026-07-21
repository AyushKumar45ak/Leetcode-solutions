class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap <>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int count=0;
        for(String a:arr){
            if(map.get(a)==1){
                count++;
            }
            if(count==k){
                return a;
            }
        }
        return "";
    }
}