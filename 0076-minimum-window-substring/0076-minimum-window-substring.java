class Solution {
    public String minWindow(String s, String t) {
                HashMap<Character , Integer> given=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        int minlength=Integer.MAX_VALUE;
        StringBuilder anstring=new StringBuilder();
        int formed=0;
        for (int i=0;i<t.length();i++){
            given.put(t.charAt(i),given.getOrDefault(t.charAt(i),0)+1);
        }
        int high=0;
        int low=0;
        while(high<s.length()){
            window.put(s.charAt(high),window.getOrDefault(s.charAt(high),0)+1);
            char ch = s.charAt(high);

            if (given.containsKey(ch) && window.get(ch).equals(given.get(ch))) {
            formed++;
            }
            while(formed==given.size()){
                        if(high-low+1<minlength){
                            minlength=high-low+1;
                            anstring.setLength(0);
                            anstring.append(s,low,high+1);
                        }
                        char c = s.charAt(low);

                        if (given.containsKey(c) && window.get(c).equals(given.get(c))) {
                          formed--;
                        }
                        window.put(s.charAt(low),window.getOrDefault(s.charAt(low),0)-1);
                        low++;

                        }
            high++;
        }
        return anstring.toString();
    }
}