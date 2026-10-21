class Solution {
    public boolean isValid(String s) {

        boolean isValid = false;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(i == 0 && (c == '}' || c == ']' || c == ')' )) {
                return isValid;
            } else if((c == '{' || c == '[' || c == '(' )) {
                stack.push(c);
            } else if(stack.isEmpty()) {
                return false;
            } else if ((stack.peek() == '{' && c == '}') || (stack.peek() == '[' && c == ']') || (stack.peek() == '(' && c == ')')){
                stack.pop();
            } else{
                return false;
            }
                
        }
        if(stack.isEmpty()){
            isValid = true;
        } else{
            isValid = false;
        }

        return isValid;
        
    }
}
