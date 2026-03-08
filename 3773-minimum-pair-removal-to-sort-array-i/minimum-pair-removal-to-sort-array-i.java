import java.util.Arrays;

class Solution {

    public int minimumPairRemoval(int[] nums) {
        int step = 0;

        while (!isSorted(nums)) {
            nums = shortArr(nums);
            step++;
        }

        return step;
    }

    private int minSum(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int pivot = 0;

        for (int i = 0; i < n - 1; i++) {
            int sum = arr[i] + arr[i + 1];

            if (sum < min) {
                min = sum;
                pivot = i;
            }
        }

        return pivot;
    }

    private int[] shortArr(int[] arr) {
        int pivot = minSum(arr);
        int n = arr.length;

        int[] shortArr = new int[n - 1];

        for (int i = 0, j = 0; i < n; i++) {

            if (i == pivot) {
                shortArr[j++] = arr[i] + arr[i + 1];
                i++; 
            } else {
                shortArr[j++] = arr[i];
            }
        }

        return shortArr;
    }

    private boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
}