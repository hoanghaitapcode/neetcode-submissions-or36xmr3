class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        while(left<right){
            
            char charL = s.charAt(left);
            char charR = s.charAt(right);
            if(!Character.isLetterOrDigit(charL)) {
                left++;
            } else if ((!Character.isLetterOrDigit(charR))){
                right--;
            }
            else {
            if(Character.toLowerCase(charL)!=Character.toLowerCase(charR)) return false;
            left++;
            right--;
            }
        }
        return true;
    }
}
