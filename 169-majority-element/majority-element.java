class Solution {
    public int majorityElement(int[] nums) {
        int ans=nums.length/2;
        HashMap <Integer,Integer> map = new HashMap <> ();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans2=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>ans){
               ans2= entry.getKey();
            }
        }
        return ans2;
    }
}