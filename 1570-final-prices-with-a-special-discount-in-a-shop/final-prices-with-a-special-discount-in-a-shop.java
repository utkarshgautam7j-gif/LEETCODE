import java.util.*;

class Solution {
    public int[] finalPrices(int[] prices) {
        int[] discount = monoStack(prices); 
        int[] res = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            res[i] = prices[i] - discount[i];
        }

        return res;
    }

    public int[] monoStack(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] discount = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() > arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                discount[i] = 0;
            } else {
                discount[i] = s.peek();
            }

            s.push(arr[i]);
        }

        return discount;
    }
}