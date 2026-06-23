class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int [] arr = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=(i+1);
        }
       HashSet <Integer> set = new HashSet <> ();
       ArrayList <Integer> list = new ArrayList <> ();
       for(int i:nums){
            set.add(i);
       }
       for(int i=0;i<nums.length;i++){
        if(!set.contains(arr[i])){
            list.add(arr[i]);
        }
       }
       return list;


    }
}