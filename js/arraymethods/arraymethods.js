// var brands = ["zara","only","mango","colors"]

// brands.forEach(function(brand,index){

// console.log("brand =" + brand + "value =" + index)
// })

// console.log("-----------------------------------")

// var hobbies = ["trekking","dancing","painting","numismatics"]

// hobbies.push("singing")
// console.log(hobbies)

// hobbies.pop()
// console.log(hobbies)

// hobbies.shift()
// console.log(hobbies)

// hobbies.unshift("painting")
// console.log(hobbies)

// var a = hobbies.indexOf("dancing")
// console.log(a) 

// var b = hobbies.indexOf("numismatics" , 2)
// console.log(b)

// var c = hobbies.join("====")
// console.log(c)

// var d = hobbies.splice(1,0,"qwqq")
// console.log(d)
// console.log(hobbies)

// var e =hobbies.slice(0,2)
// console.log(e)


var numbers = [100,200,300]

 var f = numbers.filter(function(num,index){
    if(num > 100){
        return true
    }else{
        return false
    }
})

console.log(f)


var g = numbers.filter(num=>num>100);
console.log(g)



var map = numbers.map(function(val,ind){
    var va = val + 50
    return va
})
console.log(map)

var h = numbers.map(val=>val+50);
console.log(h)

var items = [
    {name : "lipstick",
     id : 1,
    price : 500
    },
    {name : "kajal",
     id : 2,
    price : 300
    },
    {name : "shoes",
     id : 3,
    price : 2500
    },
    {name : "watch",
     id : 4,
    price : 11500
    }
]

var i = items.filter(item=>item.price>500)
console.log(i)

//  var j = items.map(items=>{
    
//    items.price = items.price+100;
//    return items
  
// })
//  var j = items.map(item => {

//     var i ={
//         name=item.name,
//         price = item.price,
//         id = item.id
//     }
//     return i
// })
// console.log(j)
// console.log(items)


var choclates = ["dairy milk","coffee bite","solano","mango bite"]

var hascoffee = choclates.includes("coffee bite")
console.log(hascoffee);

var k = Array.isArray(choclates);
console.log(k)
