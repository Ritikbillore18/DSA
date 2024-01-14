// Determine if Two Strings Are Close
class StringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        if (word1.equals(word2))  return true;   
        byte[] ch1 = word1.getBytes() , ch2 = word2.getBytes();
        int [] arr1 = new int[26] , arr2 = new int[26];

        for (byte c : ch1){
            arr1[c - 'a']++;
        }

        for (byte c : ch2)
        {
            if (arr1[c - 'a'] == 0) return false;
            arr2[c - 'a']++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // return Arrays.equals(arr1 , arr2);
        int i = 25;
        while (arr1[i] != 0 && i > 0 )
        {
            if (arr1[i] != arr2[i]) return false;
            i--;
        }

        return true;
    }
}