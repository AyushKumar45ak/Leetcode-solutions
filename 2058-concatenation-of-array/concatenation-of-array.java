class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList <Integer> list = new ArrayList <> ();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int j=0;j<nums.length;j++){
            list.add(nums[j]);
        }
        int [] ans= new int[list.size()];
        for(int k=0;k<list.size();k++){
            ans[k]=list.get(k);
        }
        return ans;

    }
}