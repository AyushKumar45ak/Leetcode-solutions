class Solution {
    public boolean checkString(String s) {
        char [] ch = s.toCharArray();
        Arrays.sort(ch);
        if(ch[0] != 'a'){
            return true;
        }
        String str = new String(ch);
        if(str.equals(s)){
            return true;
        }
        return false;

    }
}