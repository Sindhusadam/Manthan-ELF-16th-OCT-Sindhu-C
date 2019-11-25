var date = new Date()
console.log("Date is" , date);

var date1= new Date(3)
console.log("Date is" , date1);

var date2 = new Date("march 11")
console.log("Date is" , date2);

var date3 = new Date(1190,5,11)
console.log("Date is" , date3);

var year = date.getFullYear()
var hrs = date.getHours()
var min = date.getMinutes()
var mon = date.getMonth()
var day = date.getDay()
var date = date.getDate()


console.log(year)
console.log(hrs)
console.log(min)
console.log(mon)
console.log(day)
console.log(date)

var months = ["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","dec"];
var thisMonth = months[mon];

var days = ["Sunday","Monday","tuesday","Wednesday","Thursday","Friday","Saturday"]
var thisday = days[day];

console.log(thisMonth)
console.log(thisday)

var str = "10"
var num = 10

if(str === num){
    console.log("equal")
}else{
    console.log("not equal")
}


 var  age = 23
 var voting = age>18?"Eligible":"not Eligible"
 console.log(voting)

 

