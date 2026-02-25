var map = function(arr, fun){
    const newArr  = []
    for(let i = 0; i < arr.length; i++){
        newArr[i] = fn(arr[i], i);
    }
    return newArr;
}