class Solution {
    public boolean isPalindrome(String s) {
        List<Character> ls=new ArrayList<>();

        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                ls.add(Character.toLowerCase(ch));
            }
        }
        
        int left=0;
        int right=ls.size()-1;
        while(left<right){
        
           if(ls.get(left)!=ls.get(right)){
            return false;
           }
            left++;
            right--;

        }
        
        return true;
    }
}