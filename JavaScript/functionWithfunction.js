function fun(){
    return function(a, b){
        const sum = a + b;
        return sum;
    }
}

var numsum = fun()
console.log(numsum(2,3));