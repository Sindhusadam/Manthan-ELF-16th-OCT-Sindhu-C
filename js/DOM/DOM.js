// var pElement = document.getElementById("demo");
// console.log(pElement)

// var text =  pElement.textContent;
// console.log(text)

// pElement.textContent = "Good Evening"

// var modifiedText = pElement.textContent;
// console.log(modifiedText)

var pEle = document.querySelector("#demo");
pEle.textContent = "Good Night"

var elements = document.getElementsByClassName("test")
console.log(elements)

elements[0].style.color = "red"
 pEle.style.fontSize = "120px"
 pEle.style.color = "orange"

var c =  document.querySelectorAll(".test")
c[1].style.color = "blue"
c[1].style.fontSize = "50px"
c[2].style.color ="green"
c[2].style.fontFamily = "cursive"

var e = document.createElement("button")

e.textContent = "Click Click!!"
document.body.appendChild(e)
e.style.color="red "
e.style.fontFamily = "cursive"

var f = document.getElementById("add")
// f.className = "abc "

f.classList = "abc xyz"










