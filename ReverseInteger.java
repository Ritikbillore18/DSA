class Solution {
    public int reverse(int x) {
        int rem=0;
        double sum=0;
        while(x!=0){
            rem = x%10;
            if(sum*10+rem>=Integer.MAX_VALUE|| sum*10+rem<=Integer.MIN_VALUE){
                sum=0;
                break;
            } 
            sum = sum*10+rem;
            x=x/10;
        }
        int temp = (int)sum;
        return temp;
        }
    }
