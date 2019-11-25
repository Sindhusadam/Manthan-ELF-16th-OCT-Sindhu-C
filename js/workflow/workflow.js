function first(callback){
    setTimeout(function(){
        console.log("first function executed")
        callback()
    },0)

    console.log("gyughjhhuig")
    
}

function second(){
    console.log("second function executed")
}

first(second)
