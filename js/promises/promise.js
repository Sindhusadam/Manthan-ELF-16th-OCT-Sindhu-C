const pro = new Promise(function(resolve,reject){

if(0>10){
    resolve("success")
}else{
    reject("Error")
}


})

pro.then(function(data){
    console.log(data)
}).catch(function(error){
    console.log(error)
})

const personData = new Promise(function(resolve,reject){
if(20>15){
    let data = [10,20,30,40,50]
    resolve(data)
}else{
    reject("no Data")
}
})

personData.then(function(data){
    console.log(data)
    data = data.push(234,123,12)
    return data;

}).then(function(planetData){
    console.log(planetData)
}).catch(function(err){
    console.log("error",err)
})