// Object is s collection of key value pairs

// Object Literals
// var obj = {
//     name: "Meen",
//     age: 19,
//     greet(name){
//         return "good morning " + name;
//     }
// }
// console.log(obj)
// console.log(obj.greet("Meen"))

// Object With in function
// function Calc(val){
//     return{
//         add(val1){
//             var a = val + val1
//             return a;
//         },
//         sub(val1){
//             return val - val1;
//         }
//     }
//     // return obj
// }

function Calc(val){
    function add(val1){
        return val + val1;
    }
    function sub(val1){
        return val - val1;
    }
    return {
        add, sub
    }
}
console.log(Calc(5).add(2));
console.log(Calc(5).sub(2));