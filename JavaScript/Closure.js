function fun(){
    var a = 6;
    function f(b){
        var sum = a + b;
        return sum;
    }
    a = 5;
    return f;
}
const f = fun();
console.log(f(3));