class Solution {
    public int shortestSubarray(int[] nums, int k) {
        
  long[] prefixSums = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }

        // Priority queue to store (prefix sum, index)
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        pq.offer(new long[]{0, 0});
        
        int minLength = Integer.MAX_VALUE;

        // Iterate through prefix sums
        for (int i = 1; i < prefixSums.length; i++) {
            // Remove elements from the queue if the current prefix sum minus the minimum prefix sum
            // in the queue is at least k
            while (!pq.isEmpty() && prefixSums[i] - pq.peek()[0] >= k) {
                minLength = Math.min(minLength, (int) (i - pq.poll()[1]));
            }

            // Add the current prefix sum and index to the queue
            pq.offer(new long[]{prefixSums[i], i});
        }

        // Return the result
        return minLength == Integer.MAX_VALUE ? -1 : minLength;

    }
}