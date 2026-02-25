var compose = function(functions){
    return function(x){
        for(let i = functions.length-1; i >= 0; i-- ){
            x = functions[i](x)
        }
        return x;
    }
}

// Example functions
const double = x => x * 2;
const increment = x => x + 1;
const square = x => x * x;

// Compose them: square(increment(double(x)))
const composedFn = compose([square, increment, double]);

console.log(composedFn(2));
