/*
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = 0; j < n; j++) {

                if (arr[j] < arr[i]) {

                    boolean alreadyCounted = false;

                    for (int k = 0; k < j; k++) {
                        if (arr[k] == arr[j]) {
                            alreadyCounted = true;
                            break;
                        }
                    }

                    if (!alreadyCounted)
                        rank++;
                }
            }

            ans[i] = rank;
        }

        return ans;
    }
}
*/
import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] temp = arr.clone();
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int num : temp) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}
