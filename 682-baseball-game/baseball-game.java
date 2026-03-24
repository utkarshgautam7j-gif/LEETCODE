class Solution {
    public int calPoints(String[] ops) {
        int n= ops.length;
        Stack<Integer> stack = new Stack<>();
        for(int i =0 ;i<n;i++){
            if(ops[i].equals("C")){
                stack.pop();
            }
            else if(ops[i].equals("D")){
                stack.push((stack.peek())*2);
            }
            else if(ops[i].equals("+")){
                int prev=(stack.pop());
                int top = (stack.peek())+prev;
                stack.push(prev);
                stack.push(top);
            }
            else{
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        int ans =0;
        for(int i=0;i<stack.size();i++){
            ans=ans+(stack.get(i));
        }
        return ans;
    }
}