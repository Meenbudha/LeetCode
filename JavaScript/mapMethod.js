var num = [1, 3, 4,5,6];
var a = num.map((n, i, num) =>{
    return n + i;
});

// function fun(n){
//     return n + 1;
// }
console.log(a);
console.log(num);

// Array.map(function(currentValue, index, arr));