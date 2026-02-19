var creatCounter = function(n){
    return function(){
        return n++;
    };
};

const counter = creatCounter(10);
counter();
console.log(counter());
counter();
console.log(counter());