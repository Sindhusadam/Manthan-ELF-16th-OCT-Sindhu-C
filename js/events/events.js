
let pEle  = document.createElement("p")
function greet(message){
    let name = "Bill gates";
    // alert(message +" " + name )
    alert(`${message} ${name}`)
    console.log(`${3+5}`)
    console.log("3+4")
    
}

function changeFont(){

    let element = document.getElementById("test")
    element.style.fontSize = "100px"
}

function changeFontToOld(){

    let element = document.getElementById("test")
    element.style.fontSize = "50px"
}

function showData(){

    console.log("key Pressed")
}

function showElement(){
    
    pEle.textContent = "p created"
    document.body.appendChild(pEle)
}
let e1 = document.getElementById("a")
// e1.onclick = function(){
//     alert("Clicked!..")

e1.addEventListener('click',function(){
    alert
    ("Clicked!!.....")
})
