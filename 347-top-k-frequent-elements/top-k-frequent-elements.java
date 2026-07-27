class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap <> ();
        int [] ans = new int [k];
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList <> (map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        int j=0;
        int x=k;
        for(Map.Entry<Integer,Integer> entry : list){
            if(x>0){
                ans[j++]=entry.getKey();
                x--;
            }
            
        }
        return ans;
    }
}