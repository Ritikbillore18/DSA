//  Minimum Number of Steps to Make Two Strings Anagram
class   StringsAnagram {
    public int minSteps(String s, String t) {
        HashMap <Character , Integer> hs = new HashMap <>();
        int res =0;
        for (int i =0 ; i<t.length();i++ ){
            if (hs.containsKey(t.charAt(i))){
                hs.put(t.charAt(i),hs.get(t.charAt(i))+1 );
            }
            else hs.put(t.charAt(i),1);
        }
        for (int i =0 ;i<s.length();i++){
            if (!hs.containsKey(s.charAt(i))) res++;
            else if (hs.get(s.charAt(i))==1) hs.remove(s.charAt(i));
            else hs.put(s.charAt(i),hs.get(s.charAt(i))-1 );
        }
        return res ;
    }
}