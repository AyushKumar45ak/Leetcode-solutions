class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char [] ch=s.toCharArray();
        char [] ch2=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        String a = new String (ch);
        String b = new String (ch2);
        return a.equals(b);
        
    }
}