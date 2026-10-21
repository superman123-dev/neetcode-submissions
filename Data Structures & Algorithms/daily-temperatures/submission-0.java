class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] dailyTemperatures = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        

        for(int i = 0; i < temperatures.length; i++){
            if(i == 0){
                stack.add(i);
            } else if(!stack.empty()){
                while(!stack.empty() && temperatures[stack.peek()] < temperatures[i]){
                    dailyTemperatures[stack.peek()] = i - stack.pop();
                }
            }
            stack.add(i);

        }
        
        return dailyTemperatures;
    }
}
