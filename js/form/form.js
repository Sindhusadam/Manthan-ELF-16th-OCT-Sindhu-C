function validateForm(){

// let log = document.forms["LoginForm"]
// console.log(LoginForm)
// if(12>1){
//     return false
// }else{
//  return true
// }

let UserNameEle = document.forms['LoginForm']['UserName']
let passwordEle = document.forms['LoginForm']['Password']
if(UserNameEle.value.trim().length > 5 ){

    let pEle = document.getElementById("abc") 
    pEle.style.display = "none"
}else{
    // alert("fill the form")

    let pEle = document.getElementById("abc")
    pEle.style.display = "block"
  
}

if( passwordEle.value.trim().length >5){
    let pEl = document.getElementById("ab") 
    pEl.style.display = "none"
}else{

    let pEl = document.getElementById("ab")
    pEl.style.display = "block"

}
if(UserNameEle.value.trim().length > 5 && passwordEle.value.trim().length >5){
    alert("Data saved")
    return true
}else{
    return false
}
}