class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max=0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(')');
                count++;
            }
            else if(s.charAt(i)==')'){
                st.pop();
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}