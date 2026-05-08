class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for(String c : tokens) {
            if(!c.equals("+") && !c.equals("-")&&!c.equals("*")&&!c.equals("/")) {
                s.push(c);
            }
            else {
                int tempResult = 0;
                int num2 = Integer.parseInt(String.valueOf(s.pop()));
                int num1 = Integer.parseInt(String.valueOf(s.pop()));
                if(c.equals("+")) tempResult = (num1+num2);
                if(c.equals("-")) tempResult = (num1-num2);
                if(c.equals("*")) tempResult = num1*num2;
                if(c.equals("/")) tempResult = num1/num2;
                s.push(Integer.toString(tempResult));
            }
        }
        return Integer.parseInt(String.valueOf(s.pop()));
        
    }
}
