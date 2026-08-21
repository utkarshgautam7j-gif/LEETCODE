class Solution {
    public int totalFruit(int[] fruits) {

        if (fruits.length <= 2) return fruits.length;

        int[] arr = new int[2];
        arr[0] = fruits[0];
        arr[1] = fruits[1];

        int c = 2;
        int max = 2;
        int last = fruits[1];
        int lastCount = 1;

        if (fruits[0] == fruits[1]) {
            lastCount = 2;
        }

        for (int i = 2; i < fruits.length; i++) {

            if (arr[0] == fruits[i]) {
                c++;
            }
            else if (arr[1] == fruits[i]) {
                c++;
            }
            else {
                if (last == arr[0]) {
                    arr[1] = fruits[i];
                }
                else {
                    arr[0] = fruits[i];
                }

                c = lastCount + 1;
            }

            
            if (fruits[i] == last) {
                lastCount++;
            }
            else {
                last = fruits[i];
                lastCount = 1;
            }

            max = Math.max(max, c);
        }

        return max;
    }
}