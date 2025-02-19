class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        HashSet<Integer> Unique = new HashSet<>();

        minHeap.offer(nums[0]);
        Unique.add(nums[0]);
        
        for(int i = 0;i<nums.length;i++){

            if(Unique.contains(nums[i])){
                continue;
            }

            int temp = minHeap.peek();

            if(nums[i] > temp && minHeap.size() == 3 ){
                minHeap.poll();
                minHeap.offer(nums[i]);
                Unique.add(nums[i]);
            } else if(minHeap.size() < 3){
                Unique.add(nums[i]);
                minHeap.offer(nums[i]);
            }
        }

        if(minHeap.size() == 2){
            minHeap.poll();
        }

        return minHeap.peek();
    }
}