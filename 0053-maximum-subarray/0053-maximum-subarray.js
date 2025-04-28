/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let maxSum = Number.MIN_SAFE_INTEGER;
    let curSum = 0;

    for(let n of nums){
        maxSum = Math.max(maxSum,n);
    }

    for(let n of nums){
        curSum += n;
        maxSum = Math.max(curSum,maxSum);

        if(curSum < 0){
            curSum = 0;
        }
    }
    return maxSum;
};