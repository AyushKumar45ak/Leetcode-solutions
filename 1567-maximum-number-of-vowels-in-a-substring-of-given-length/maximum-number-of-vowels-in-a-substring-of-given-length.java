class Solution {
    public int maxVowels(String s, int k) {
        String vowels="aeiou";
        HashSet <Character> set = new HashSet <> ();
        int count=0;
        for(char i:vowels.toCharArray()){
            set.add(i);
        }
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        int max=count;
        for(int i=k;i<s.length();i++){
            if(set.contains(s.charAt(i-k))){
                count--;
            }
            if(set.contains(s.charAt(i))){
                count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}