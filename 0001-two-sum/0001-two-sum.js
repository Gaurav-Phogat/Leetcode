/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let arr = [];
    const myMap = new Map();

    for(let i = 0;i < nums.length;i++){

        if(myMap.has(target-nums[i])){
            arr.push(myMap.get(target-nums[i]));
            arr.push(i);
            return arr;
        }
        myMap.set(nums[i],i);
    }
    return arr;
};