/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const mySet = new Set();

    for(let n of nums){
        if(mySet.has(n)) return true;
        mySet.add(n);
    }
    return false
};