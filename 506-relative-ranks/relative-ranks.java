class Solution {
    public String[] findRelativeRanks(int[] score) {
        int [] ans = new int [score.length];
        int count =1;
        for(int i=0;i<score.length;i++){
            for(int j=0;j<score.length;j++){
                if(score[i]<score[j]){
                    count++;
                }
            }
            ans[i]=count;
            count = 1;
        }
        String [] ans2 = new String [score.length];
        for(int i=0;i<ans.length;i++){
            if(ans[i]==1){
                ans2 [i]="Gold Medal";
            }
            else if(ans[i]==2){
                ans2 [i]="Silver Medal";
            }
            else if(ans[i]==3){
                ans2 [i]="Bronze Medal";
            }
            else{
                ans2 [i] =String.valueOf(ans[i]);
            }
        }
        return ans2;
    }
}