class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int n = nums.length;
        int longest = 1;
        for(int i =0;i<n;i++){
            set.add(nums[i]);
        }
        if(set.isEmpty())
        return 0;
        for(int num :set) {
            if(!set.contains(num-1)){
                int current = 1;
                while(set.contains(num+1)){
                    current+=1;
                    num = num+1;
                }
                longest = Math.max(current,longest);
            }
        }
        return longest;
            
    }
}
