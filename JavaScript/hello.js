
// @return {function};
var createHelloWorld = function(){
    return function(...arts){
        return "Hello World"
    }
}

const f = createHelloWorld();
f();
console.log(f()); // "Hello World"