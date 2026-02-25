
var reduce = function(nums, fn, init){
    let total = init;
    for (let i = 0; i < nums.length; i++) {
        total = fn(total, nums[i]);        
    }
    return total;
}
// Sum of numbers
let nums = [1, 2, 3, 4];
let sum = reduce(nums, (acc, curr) => acc + curr, 0);
console.log(sum); // 10

// Product of numbers
let product = reduce(nums, (acc, curr) => acc * curr, 1);
console.log(product); // 24

// Concatenate strings
let words = ["Hello", "World", "JS"];
let sentence = reduce(words, (acc, curr) => acc + " " + curr, "");
console.log(sentence.trim()); // "Hello World JS"


// let arr = [1,2,3,4,5]

// let sum = arr.reduce((a, b)=>{
//     console.log(a)
//     console.log(b)
    
//     console.log()
//     return a + b;
// });

// console.log(sum);

// Array.reduce(function(total, currentValue, currentIndex, arr))