var creatCounter = function(init){
    let value = init;
    return {
        increment(){
            return ++value;
        },
        decrement(){
            return --value;
        },
        reset(){
            return value = init;
        }
    }
};

const counter = creatCounter(5);
console.log(counter.increment());
console.log(counter.reset());
console.log(counter.decrement());