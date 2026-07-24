class Solution {
            public String reverseVowels(String s) {
                HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );
        char [] ch=s.toCharArray();
        for(int i=0,j=ch.length-1;i<j;){
            if(!vowels.contains(ch[i])){
                i++;
            }
            if(!vowels.contains(ch[j])){
                j--;
            }
            if(vowels.contains(ch[i]) && vowels.contains(ch[j])){
                if(i<j){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                    i++;
                    j--;
                }
            }
        }
        String ans=new String(ch);
        return ans;
    }
}