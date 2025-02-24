class Solution {
    public int findNonMinOrMax(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int n : nums){
            minHeap.offer(n);
            if(minHeap.size() == 3){
                minHeap.poll();
                return minHeap.peek();
            }
        }
        return -1;
    }
}