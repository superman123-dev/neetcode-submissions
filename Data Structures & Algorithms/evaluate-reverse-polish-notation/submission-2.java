class Solution {
    public int evalRPN(String[] tokens) {
        
        int evalRPN = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            //if it is a number then add to stack
            //else if it is a operator then pop
            if(!Set.of("+", "-", "*", "/").contains(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int one = stack.pop();
                int two = stack.pop();
                if(tokens[i].equals("+")){
                    stack.push(one + two);
                } else if(tokens[i].equals("*")){
                    stack.push(one * two);
                } else if(tokens[i].equals("/")){
                    stack.push(two / one);
                } else if(tokens[i].equals("-")){;
                    stack.push(two - one);
                }
            }
        }
        
        return evalRPN = stack.pop();
    }
}
