class Solution {
    public String minWindow(String s, String t) {
                HashMap<Character , Integer> given=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        int minlength=Integer.MAX_VALUE;
        StringBuilder anstring=new StringBuilder();
        for (int i=0;i<t.length();i++){
            given.put(t.charAt(i),given.getOrDefault(t.charAt(i),0)+1);
        }
        int high=0;
        int low=0;
        while(high<s.length()){
            window.put(s.charAt(high),window.getOrDefault(s.charAt(high),0)+1);
            if(t.length()<=(high-low+1)){
                boolean flag=true;
                while(flag==true){
                    for (char ch : given.keySet()){
                        if (window.getOrDefault(ch,0)<given.getOrDefault(ch,0)){
                            flag=false;
                            break;
                        }
                    }
                    if(flag==true){
                        if(high-low+1<minlength){
                            minlength=high-low+1;
                            anstring.setLength(0);
                            anstring.append(s,low,high+1);
                        }
                         window.put(s.charAt(low),window.getOrDefault(s.charAt(low),0)-1);
                        low++;

                        }
                    else{
                        break;
                    }
                }
            }
            high++;
        }
        return anstring.toString();
    }
}