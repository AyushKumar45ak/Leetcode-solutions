class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum=0;
        int dSum=0;
        for(int i=0;i<nums.length;i++){
            eSum=eSum+nums[i];
            int n=nums[i];
            while(n>0){
                dSum=dSum+n%10;
                n=n/10;
            }
        }
        int res=Math.abs(eSum-dSum);
        return res;

    }
}