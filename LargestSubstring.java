class  LargestSubstring{
    public int maxLengthBetweenEqualCharacters(String s)
    {
        Map<Character ,Integer> map = new HashMap();
        int largest = -1;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                    largest = Math.max(largest , i - map.get(c) -1);

            }
            else 
            {
                map.put(c,i);
            }
        }
        return largest;
    }
}