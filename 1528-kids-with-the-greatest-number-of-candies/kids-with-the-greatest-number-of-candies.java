class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean [] ans= new boolean[candies.length];
        List <Boolean> list = new ArrayList <> ();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ans[i]=true;
            }
        }
        for(boolean s:ans){
            list.add(s);
        }
        return list;
    }
}