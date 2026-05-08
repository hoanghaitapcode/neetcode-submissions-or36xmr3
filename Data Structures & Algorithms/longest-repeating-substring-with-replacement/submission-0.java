class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int count = 0;
        int maxRepeated = 0;
        HashMap<Character,Integer> table = new HashMap<>();
        for(int right =0;right<s.length();right++) {
            char rightChar = s.charAt(right);
            table.put(rightChar,table.getOrDefault(rightChar,0)+1);
            maxRepeated = Math.max(maxRepeated,table.get(rightChar));
            while(right-left+1 - maxRepeated > k)    {
                char charLeft = s.charAt(left);
                table.put(charLeft,table.get(charLeft)-1);
                left++;
            }
            count = Math.max(count,right-left+1);        
        }
        return count;
    }
}
