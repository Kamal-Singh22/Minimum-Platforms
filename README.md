# Minimum-Platforms
Given arrival and departure times of n trains at a railway station, find the minimum number of platforms required so that no train waits.

Explanation:
Sort both arrival[] and departure[] arrays.
Use two pointers:
i → Tracks arriving trains.
j → Tracks departing trains.
If a train arrives before the earliest departure, increase the platform count.
If a train departs, decrease the platform count.
Keep track of the maximum number of platforms used at any time.

Complexity Analysis:
Sorting takes O(n log n).
The main loop runs in O(n).
Overall Complexity: O(n log n)...
