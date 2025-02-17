class Solution {
    public int countPrimes(int n) {
        boolean[] ans = new boolean[n+1];

        for(int i = 2; i*i <= n;i++){
            if(ans[i] == false){
                for(int j = i*i;j <= n;j += i){
                    ans[j] = true;
                }
            }
        }
        int count = 0;
        for(int i = 2;i < n;i++){
            if(ans[i] == false){
                count++;
            }
        }
        
        return count;
    }
}