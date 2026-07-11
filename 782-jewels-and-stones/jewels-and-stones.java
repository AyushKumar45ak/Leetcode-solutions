class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char [] ch=jewels.toCharArray();
        HashMap <Character,Integer> map = new HashMap <>();
        for(char c:stones.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans=0;
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                ans=ans+map.get(ch[i]);
            }
        }
        return ans;
    }
}