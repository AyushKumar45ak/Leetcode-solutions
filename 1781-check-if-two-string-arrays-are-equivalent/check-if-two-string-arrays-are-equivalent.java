class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s=String.join("",word1);
        char [] ch=s.toCharArray();
        String s2=String.join("",word2);
        char [] ch2=s2.toCharArray();
        if(ch2.length != ch.length){
            return false;
        } 
        for(int i=0;i<ch.length;i++){
            if(ch[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
}