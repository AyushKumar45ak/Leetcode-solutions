class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n=1;
        int m=nums.length;
        int [] comp=new int [nums.length];
        for(int j=0,k=n;j<nums.length  && m>0;j++,k++,m--){
            comp[j]=k;
        }
        int [] temp=new int[2];
        HashMap<Integer,Integer> map = new HashMap <> ();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int x=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==2){
                temp[x++]=entry.getKey();
            }
        }
        for(int k=0;k<comp.length;k++){
            if(!map.containsKey(comp[k])){
                temp[x++]=comp[k];
            }
        }
        return temp;


    }
}