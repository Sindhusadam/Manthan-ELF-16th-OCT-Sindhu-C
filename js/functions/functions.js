console.log("named functions....")

function add(num1,num2){
    var sum  = num1 + num2
    console.log(sum)
}

add(10,28)


add1(10,20)

function add1(num1,num2){
    var sum  = num1 + num2
    console.log(sum)
}



    console.log("anonymous function..........")

    var mul =function(a,b){
        var pro = a*b
        console.log(pro)
      
    }
    mul(12,2);

    

    console.log("self invoked function.............");

    (function(s){
        var sq = s*s;
        console.log(sq)
    })(13)


    
    console.log("Arrow function.............")
    var divi = (c,d)=>{
         var div = c/d
         console.log(div)  
     }
    divi(30,5)


   

    console.log("---------------------")
    var sum =(i,j)=>i+j
    var val = sum(23,45)
    console.log(val)