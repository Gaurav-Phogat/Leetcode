class Solution {
    public int mySqrt(int x) {
        int ans = 0;

        for(int i = 1;i <= x ; i++){
            if((long) i*i <= x){
                ans++;
                continue;
            }
            break;
        }
        return ans;
    }
}