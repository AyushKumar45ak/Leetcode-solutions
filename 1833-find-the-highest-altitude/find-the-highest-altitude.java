class Solution {
    public int largestAltitude(int[] gain) {
        int [] arr = new int[gain.length+1];
        int sum=0;
        arr[0]=0;
        for(int i=1,j=0;i<arr.length && j<gain.length;j++,i++){
            sum=sum+gain[j];
            arr[i]=sum;
        }
        int max=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]>max){
                max=arr[k];
            }
        }
        return max;
    }
}