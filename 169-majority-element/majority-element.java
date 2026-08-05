class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap <> ();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int majEle=nums[0];
        for(int i=1;i<nums.length;i++){
            if(map.get(Integer.valueOf(nums[i]))>map.get(Integer.valueOf(majEle))){
                majEle=nums[i];
            }
        }
        return majEle;
    }
}