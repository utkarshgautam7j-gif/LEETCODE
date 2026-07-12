class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int x = n / 4;

        int c = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                c++;
                if (c > x)
                    return arr[i];
            } else {
                c = 1;
            }
        }

        return arr[0];
    }
}