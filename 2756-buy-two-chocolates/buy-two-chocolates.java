class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int temp=money;
        int count=0;
        for(int i=0;i<prices.length;i++){
           if(count<2){
                if(money>0 && prices[i]<=money){
                    money=money-prices[i];
                    count++;
                }
           }
        }
        if(count == 2 ){
            return money;
        }
        
        return temp;
        
    }
}