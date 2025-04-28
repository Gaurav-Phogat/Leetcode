/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let lowest = prices[0];
    let maxProfit = 0;

    for(let price of prices){
        maxProfit = Math.max(maxProfit,price-lowest);
        if(price < lowest){
            lowest = price;
        }
    }
    return maxProfit;
};