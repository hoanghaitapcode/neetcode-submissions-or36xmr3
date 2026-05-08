class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<temperatures.length;i++ ) {
            while(!s.isEmpty()&&temperatures[i]>temperatures[s.peek()]) {
                int prevIndex = s.pop();
                result[prevIndex] = i - prevIndex;
            }
            s.push(i);
        }
        return result;

    }
}
