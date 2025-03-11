import java.util.Arrays;

public class MinimumPlatforms {
    public static int findMinimumPlatforms(int[] arrival, int[] departure, int n) {
        // Sort arrival and departure times
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platforms = 1, maxPlatforms = 1;
        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platforms++; // A new train arrives, need a platform
                i++;
            } else {
                platforms--; // A train departs, free up a platform
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arrival.length;

        System.out.println("Minimum platforms required: " + findMinimumPlatforms(arrival, departure, n));
    }
}
