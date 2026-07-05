class Solution {
    public int maxProduct(int n) {
        int temp=n;
        int max=0;
        int secMax=0;
        while(temp>0){
            int a=temp%10;
            if(a>=max){
                secMax=max;
                max=a;
            }
            else if(a>secMax){
                secMax=a;
            }
            temp=temp/10;
        }
       int res=max*secMax;
        return res;
    }
}