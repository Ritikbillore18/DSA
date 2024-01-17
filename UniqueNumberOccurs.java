//   Unique Number of Occurrences
class UniqueNumberOccurs {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> fq = new HashMap<>();

        for(int e : arr) {
            fq.put(e, fq.getOrDefault(e, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for(int e: fq.values()) {
            set.add(e);
        }

        return fq.size() == set.size();
    }
}