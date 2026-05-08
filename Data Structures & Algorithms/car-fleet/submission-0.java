class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] posAndTime = new double[n][2];
        for(int i=0;i<n;i++) {
            posAndTime[i][0] = position[i];
            posAndTime[i][1] =(double) (target-position[i])/speed[i];
        }
        Arrays.sort(posAndTime,(a,b)->Double.compare(b[0],a[0]));
        Stack<Double> s = new Stack<>();
        for(int i =0;i<n;i++) {
            double current = posAndTime[i][1];
            if(s.isEmpty()||current>s.peek()) {
                s.push(current);
            }
        }
        return s.size();

    }
}
