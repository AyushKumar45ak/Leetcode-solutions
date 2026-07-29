class Solution {
    public int maxVowels(String s, int k) {
        String vowel="aieou";
        HashSet <Character> set = new HashSet <> ();
        for(char c:vowel.toCharArray()){
            set.add(c);
        }
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        max=count;
        int ans=0;
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