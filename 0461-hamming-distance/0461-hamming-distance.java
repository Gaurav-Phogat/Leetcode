class Solution {
    public int hammingDistance(int x, int y) {
        int curr = x^y;
        int count = 0;
        while(curr != 0){
            count += curr&1;
            curr >>>= 1;
        }
        return count;
    }
}