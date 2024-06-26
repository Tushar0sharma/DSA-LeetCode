class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int hi = 1000000000;
        int lo = 1;

        while (lo < hi) {
            int mi = (lo + hi + 1) / 2; 
            if (check(position, mi, m)) {
                lo = mi;
            } else {
                hi = mi - 1;
            }
        }

        return lo;
    }

    private boolean check(int[] position, int minimumDistance, int m) {
        int lastBallPosition = position[0];
        int ballsLeftToBePlaced = m - 1;
        for (int i = 1; i < position.length && ballsLeftToBePlaced != 0; ) {
            if (position[i] - lastBallPosition < minimumDistance) {
                i++;
            } else {
                lastBallPosition = position[i];
                ballsLeftToBePlaced--;
            }
        }
        return ballsLeftToBePlaced == 0;
    }
}