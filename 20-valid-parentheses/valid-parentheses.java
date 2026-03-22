import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack <Character> box = new Stack<>();
        for(int i =0 ;i<s.length();i++){
            if(s.charAt(i)=='('){
                box.push(')');
            }
            else if(s.charAt(i)=='{'){
                box.push('}');
            }
            else if(s.charAt(i)=='['){
                box.push(']');
            }
            else if (box.isEmpty() || s.charAt(i)!=box.pop()){
                return false;
            }
        }
        if(box.isEmpty()){
            return true;
        }
        return false;
    }
}