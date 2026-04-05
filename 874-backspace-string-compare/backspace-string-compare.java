class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
            } else {
                s1.push(s.charAt(i));
            }
        }
        for (int j = 0; j < t.length(); j++) {
            if (t.charAt(j) == '#') {
                if (!t1.isEmpty()) {
                    t1.pop();
                }
            } else {
                t1.push(t.charAt(j));
            }
        }
        return s1.equals(t1);
    }
}