class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=1;i<=n;i++) {
            map.put(i,0);
        }

        int frequency = -1;
        int result = -1;

        for(int i=0;i<n;i++) {
            
            frequency = map.get(nums[i]);
            if(frequency!=-1) {
                map.put(nums[i],++frequency);
                if (frequency>=2) {
                    result = nums[i];
                }
            }
            frequency = -1;
        }
        return result;
    }
}
