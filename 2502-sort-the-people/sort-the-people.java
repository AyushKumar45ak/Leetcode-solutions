class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap <Integer,String> map = new HashMap <> ();
        String [] ans = new String [heights.length];
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=heights.length-1,j=0;i>=0;i--){
            ans[j++]=map.get(heights[i]);
        }
        return ans;
    }
}