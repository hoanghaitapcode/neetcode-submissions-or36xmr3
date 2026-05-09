class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),0,nums,target,0);
        return result;
    }
    void backtrack( List<List<Integer>> result,List<Integer> subset,int start,int[] nums,int target,int sum) {
        if(sum==target) {
            result.add(new ArrayList<>(subset));
            return;
        }
        if(sum>target) return;
        for(int i =start;i<nums.length;i++){
            subset.add(nums[i]);
            backtrack(result,subset,i,nums,target,sum+nums[i]);
            subset.remove(subset.size()-1);

        }
    }
}
