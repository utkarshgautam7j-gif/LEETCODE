class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += piles[i];
        }

        int min = (int) (sum / h);
        if (min == 0)
            min = 1;

        int req = Integer.MAX_VALUE;

        while (req > h) {
            int time = 0;
            for (int j = 0; j < n; j++) {
                time += (piles[j] + min - 1) / min;
            }
            req = time;
            min++;
        }

        return min - 1;
    }
}
