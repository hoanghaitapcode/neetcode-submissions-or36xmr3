class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backtrack(result,subset,0,nums);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> subset,int start,int nums[]) {
        result.add(new ArrayList<>(subset));
        for(int i =start;i<nums.length;i++){
            subset.add(nums[i]);
            backtrack(result,subset,i+1,nums);
            subset.remove(subset.size()-1);
        }
    }
}
