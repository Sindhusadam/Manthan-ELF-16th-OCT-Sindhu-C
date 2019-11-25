let person = {

    name : "Sindhu",
    age : 22,
    hobbies : ["Painting","Singing"]
}

let {name,hobbies} = person;
console.log(hobbies)

displayName(person)
function displayName({name, age}){

console.log(name)
console.log(age)

}

// let hobbies = ["Singing" ,"Dancing","jumping","Cooking"]

// let [hobby0 ,hobby1] = hobbies;
// console.log(hobby0)
// console.log(hobby1)


console.log("---------------------------------------")

let items = [

    {
        id : 1,
        name : "bag",
        price : 500
    },

    {
        id : 2,
        name : "watch",
        price : 1500
    }
]
console.log(items)
items[0].id = 5;
console.log(items)

var item = {...items[0]}
console.log(item)
item.id =20;
console.log(items)
console.log(item)

let address ={
    city : "bangalore",
    pincode : 456625
}

let personAddress = {...person , ...address}
console.log(personAddress)

var arr = [10,20,30,40]
var arr1 = [50,60,70]
var arrays = [...arr,...arr1]

console.log("-------------------------------")

function  sum(...args){
    let val;
    for(let i =0;i<args.length;i++)
    {
        val+=args[i];
    }

}








