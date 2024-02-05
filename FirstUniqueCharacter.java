// First Unique Character in a String

class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        // Create a HashMap to store the frequency of characters
        HashMap<Character,Integer> hm = new HashMap<>();

        // Iterate through the string to populate the HashMap
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Increment the count of character c in the HashMap
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
       
        // Iterate through the string again to find the first unique character
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the frequency of character c is 1, return its index
            if(hm.get(c) == 1)
                return i;
        }

        // If no unique character found, return -1
        return -1;
    }
}
