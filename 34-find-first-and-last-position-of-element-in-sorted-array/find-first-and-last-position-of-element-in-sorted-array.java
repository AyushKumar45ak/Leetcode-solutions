class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = new int [2];
        int k=0;
        boolean f=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans[0]=i;
                k=i;
                f=true;
                break;
            }
        }
        if(!f){
           ans[0]=-1;
            ans[1]=-1;
            return ans;
        }

        for(int j=k;j<nums.length;j++){
            if(nums[j]!=target ){
                ans[1]=j-1;
                break;
            }
        }
        if(nums[nums.length-1] == target){
            ans[1]=nums.length-1;
        }
        return ans;
        
    }
}