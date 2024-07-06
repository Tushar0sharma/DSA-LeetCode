/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    var fil=[];
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i],i)){
            fil.push(arr[i]);
        }
    }
    return fil;
};