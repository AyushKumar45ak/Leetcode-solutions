class Solution {
    public String greatestLetter(String s) {
        char [] temp=s.toCharArray();
        TreeSet<String> set=new TreeSet<>();
        boolean found=false;
        for(int i=0;i<temp.length;i++){
            char a=temp[i];
            if(Character.isUpperCase(a)){
                for(int k=0;k<temp.length;k++){
                    if(temp[k]==Character.toLowerCase(a)){
                        set.add(String.valueOf(a));
                        found=true;
                    }
                }
            }
            else if(Character.isLowerCase(a)){
                for(int k=0;k<temp.length;k++){
                    if(temp[k]==Character.toUpperCase(a)){
                        set.add(String.valueOf(Character.toUpperCase(a)));
                        found=true;
                    }
                }
            }
        }
        if(!found){
            String ans="";
            return ans;
        }
        return set.last();
    }
}