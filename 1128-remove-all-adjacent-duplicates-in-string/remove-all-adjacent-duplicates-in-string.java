import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> box= new Stack <>();
        for(int i=0;i<s.length();i++){
            if(!box.isEmpty() && s.charAt(i)==box.peek()){
                box.pop();
            }
            else{
                box.push(s.charAt(i));
            }
        }
        String ans="";
        for(int i=0;i<box.size();i++){
            ans=ans+box.get(i);
        }
        return ans;
    }
}