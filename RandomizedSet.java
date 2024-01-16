//  Insert Delete GetRandom O(1)
class RandomizedSet {
    private List<Integer> list;

    public RandomizedSet() {
        list = new ArrayList<>();
        
    }
    
    public boolean insert(int val) {
        if(list.contains(val)){
        return false;
        }
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(list.contains(val)){
            list.remove(Integer.valueOf(val));
            return true;
        }
        return false;
        
    }

    //To generate reandom number we will follow the steps as given in the quesiton
    
    public int getRandom() {
        int rand = (int) (Math.random() * list.size());
        return list.get(rand);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */