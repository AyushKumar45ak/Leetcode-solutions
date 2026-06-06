class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] leftsum=new int[nums.length];
        int [] rightsum=new int[nums.length];
        int [] ans=new int[nums.length];
        int sum=0;
        leftsum[0]=sum;
        for(int i=1;i<leftsum.length;i++){
            sum=sum+nums[i-1];
            leftsum[i]=sum;
        }
        int rsum=0;
        for(int j=0;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                rsum=rsum+nums[k];
            }
            rightsum[j]=rsum;
            rsum=0;
        }
        for(int p=0;p<nums.length;p++){
            ans[p]=Math.abs(leftsum[p]-rightsum[p]);
        }
        return ans;
    }
}