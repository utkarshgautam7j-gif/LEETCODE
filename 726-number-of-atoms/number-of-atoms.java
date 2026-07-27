class Solution {

    public String countOfAtoms(String formula) {

        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new HashMap<>());

        int i = 0;
        int n = formula.length();

        while (i < n) {

            char ch = formula.charAt(i);

            // Opening bracket
            if (ch == '(') {
                stack.push(new HashMap<>());
                i++;
            }

            // Closing bracket
            else if (ch == ')') {

                i++;

                int num = 0;

                while (i < n && Character.isDigit(formula.charAt(i))) {
                    num = num * 10 + (formula.charAt(i) - '0');
                    i++;
                }

                if (num == 0)
                    num = 1;

                Map<String, Integer> top = stack.pop();
                Map<String, Integer> curr = stack.peek();

                for (String atom : top.keySet()) {
                    curr.put(atom, curr.getOrDefault(atom, 0) + top.get(atom) * num);
                }
            }

            // Parse atom
            else {

                StringBuilder atom = new StringBuilder();

                atom.append(formula.charAt(i));
                i++;

                while (i < n && Character.isLowerCase(formula.charAt(i))) {
                    atom.append(formula.charAt(i));
                    i++;
                }

                int num = 0;

                while (i < n && Character.isDigit(formula.charAt(i))) {
                    num = num * 10 + (formula.charAt(i) - '0');
                    i++;
                }

                if (num == 0)
                    num = 1;

                Map<String, Integer> curr = stack.peek();

                curr.put(atom.toString(),
                        curr.getOrDefault(atom.toString(), 0) + num);
            }
        }

        TreeMap<String, Integer> sorted = new TreeMap<>(stack.pop());

        StringBuilder ans = new StringBuilder();

        for (String atom : sorted.keySet()) {

            ans.append(atom);

            if (sorted.get(atom) > 1)
                ans.append(sorted.get(atom));
        }

        return ans.toString();
    }
}