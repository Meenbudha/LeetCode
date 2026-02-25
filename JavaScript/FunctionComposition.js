function add(args){
    return args[0] + args[1];
}

function mulTwo(val){
    return val*2;
}

function square(val){
    return val * val;
}
// function addsquare(a, b){
//     return square(add(a,b));
// }
// // const result = add(2,3);
// // console.log(square(result));

// console.log(addsquare(3,4));


// function compose(f1, f2){
//     return function(a, b){
//         return f2(f1(a,b))
//     }
// }

// const compose = (f1, f2, f3) => (a, b) => f3(f2(f1(a, b)));

// const result = compose(add, mulTwo, square);
// console.log(result(2,4))

// function composeAll(...funs){
//     return function(...values){
//         return funs.reduce((val, fn) => fn(val), values)
//     }
// }

const composeAll = 
    (...funs) =>
        (...values) =>
            funs.reduce((val, fn) => fn(val), values);
    
const result = composeAll(add, mulTwo, square);
console.log(result(2,4))
