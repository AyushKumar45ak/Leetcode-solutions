class Solution {
    public long sumAndMultiply(int n) {
        Stack <Integer> st = new Stack <> ();
        long sum=0;
        long ans=0;
        while(n>0){
            if(n%10!=0){
                st.push(n%10);
            }
            n=n/10;
        }
        while(! st.isEmpty()){
            int k=st.pop();
            ans=ans*10+k;
            sum=sum+k;
        }
        
        return ans*sum;
    }
}