var hobbies = ["Trekking","Sleeping","Eating","travelling"]


for(var i =0;i<hobbies.length;i++){
    console.log(hobbies[i])
}

console.log("------------------------------------")

for(var hobby of hobbies){
    console.log(hobby)
}

console.log("------------------------------------")

for(var index in hobbies){
    console.log(hobbies[index])
}

var employee = {
    name : 'Amy',
    age : 22,
    color : "weatish",
    phoneno : 435687679,
    hobbies : ["Trekking","Sleeping","Eating","travelling"]


}
var name = employee["name"];
console.log(name)

for(var key in employee){
    console.log(employee[key])
}