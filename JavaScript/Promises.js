// const myPromise = new Promise(function(resolve, reject){
//     setTimeout(function(){
//         console.log("async Task")
//         resolve();
//     }, 2000)
// })

// myPromise.then(function(){
//     console.log("Promise Resolved")
// })

// const myPromise = new Promise(function(resolve, reject){
//     let fileLoder = false;
//     if(fileLoder){
//         resolve("File Loaded")
//     } else {
//         reject("File Not Loaded")
//     }
// })

// myPromise.then(value =>console.log(value))
//          .catch(error => console.log(error))

// async/Await = Async = makes a function reutrn a Promise
//               Await = makes and async function wait for a promise


function LoadFile(){
    return new Promise(function(resolve, reject){
        let fileLoder = true;
        if(fileLoder){
            resolve("File Loaded")
        } else {
            reject("File Not Loaded")
        }
    })  
}

async function myFunction(){
    try{
        const value = await LoadFile()
        console.log(value)
    } catch(error){
        console.log(error);
    }
}

myFunction();
