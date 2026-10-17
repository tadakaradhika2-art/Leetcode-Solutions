class Solution {
    public int countDigits(int num) {
        int count=0;
        int original=num;
        while(original>0){
            int digit=original%10;
            if(num % digit==0){
                count++;
            }
            original/=10;
        }
        return count;
    }
}