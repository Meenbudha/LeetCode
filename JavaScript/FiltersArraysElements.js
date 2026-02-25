var filter = function(arr, fn){
    let newArr = [];
    for(let i = 0; i < arr.length; i++){
        if(fn(arr[i], i)){
            newArr.push(arr[i]);
        }
    }
    return newArr;
}
let nums = [1, 2,3,2,5];
let evens = filter(nums, function(n){
    return n % 2 === 0;
})
console.log(evens);

let greaterThanIndex = filter(nums, function(n, i){
    return n > i;
});
console.log(greaterThanIndex)

// const ages = [19, 12, 23, 21, 5]

// const result = ages.filter(checkAdult)

// function checkAdult(age){
//     return age >= 18;
// }
// console.log(ages)
// console.log(result);