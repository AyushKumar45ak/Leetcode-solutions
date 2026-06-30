class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans=new int [nums1.length];
        int c=0;
        for(int i=0;i<nums1.length;i++){
            int d=nums1[i];
            for(int k=0;k<nums2.length;k++){
                if(d==nums2[k]){
                    int x=k;
                    int a=nums2[k];
                    boolean found=false;
                    for(int j=k+1;j<nums2.length;j++){
                        if(a<nums2[j]){
                            ans[i]=nums2[j];
                            found=true;
                            break;
                        }
                    }
                if(!found){
                    ans[i]=-1;
                }
                break;
                   
            }
            }
        }
        return ans;
    }
}