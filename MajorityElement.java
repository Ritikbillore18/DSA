// Majority Element

class MajorityElement {
    public int majorityElement(int[] nums) {
        int i = 1, element = nums[0], count = 1;
        while(i < nums.length){
            if(nums[i++] != element){
                count--;                
            }else{
                count++;
            }
            if(count < 0){
                element = nums[i-1];
                count = 0;
            }
        }
        return element;
    }
}