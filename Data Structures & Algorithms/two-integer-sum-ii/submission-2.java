class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int startNum = 0;
        int n = numbers.length;
        
        
        int[] result = new int[2];
        while(startNum != n) {
            int left = numbers[startNum];
            int right = numbers[n-1];
            if(left+right == target) {
                result[0] = startNum+1;
                result[1]= n;
                return result;
            }
            if (left+right > target) {
                n-=1;
            }
            if(left+right<target) {
                startNum +=1;
            }
        }

        return result;

        
    }
}
