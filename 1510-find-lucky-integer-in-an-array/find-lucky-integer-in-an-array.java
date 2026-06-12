class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int lucky=0;
        for(int n:arr){
            if(map.get(n)==n){
                if(lucky<n){
                    lucky=n;
                }
            }
        }
        if(lucky==0){
            return -1;
        }
        return lucky;
    }
}