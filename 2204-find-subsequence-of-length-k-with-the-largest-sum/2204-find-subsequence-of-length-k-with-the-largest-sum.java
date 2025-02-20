class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length ; i++){
            minHeap.add(new int[] {nums[i],i});
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] index = new int[k];
        int j = 0;
        
        while(!minHeap.isEmpty()){
            int[] temp = minHeap.poll();
            map.put(temp[1],temp[0]);
            index[j++] = temp[1];
        }
        Arrays.sort(index);

        int[] ans = new int[k];

        for(int i = 0;i < k ;i++){
            ans[i] = map.get(index[i]);
        }
        return ans;

    }
}