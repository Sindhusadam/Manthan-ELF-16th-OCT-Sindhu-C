const person={
    
    name : "rani",
    age : 23,
    weight : 50,
    hobbies : ["Singing","Dancing"]

}

const JSONobject = JSON.stringify(person)
console.log(JSONobject)

const JSONobjec = JSON.parse(JSONobject)
console.log(JSONobjec)