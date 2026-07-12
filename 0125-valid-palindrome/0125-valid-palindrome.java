class Solution {
    public boolean isPalindrome(String s) {
        String alphanumeric=("abcdefghijklmnopqrstuvwxyz12345678910");
        //ArrayList<String> t=new ArrayList<String>();
        String newstring="";
        String lower=(s.toLowerCase());
        int j=0;
        for (int i=0;i<lower.length();i++){
            if (alphanumeric.indexOf(lower.charAt(i))>=0){
                //t.add((s[i].toLowerCase()));
                newstring=newstring+(lower.charAt(i));
            }

        }
        int len=newstring.length();
        while(j<((len)/2)){
            if(newstring.charAt(j)!=newstring.charAt(len-j-1)){
                return false;
            }
            j++;
        }
        return true;
        
    }
}