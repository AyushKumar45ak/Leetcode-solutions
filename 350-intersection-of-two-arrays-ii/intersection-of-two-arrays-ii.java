class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList <Integer> list = new ArrayList <> ();
        for(int x:nums2){
            list.add(x);
        }
        ArrayList <Integer> ansList = new ArrayList <> ();
        for(int i:nums1){
            if(list.contains(i)){
                ansList.add(i);
                list.remove(Integer.valueOf(i));

            }
        }
        int [] ans = new int [ansList.size()];
        for(int k=0;k<ansList.size();k++){
            ans[k]=ansList.get(k);
        }
        return ans;
    }
}