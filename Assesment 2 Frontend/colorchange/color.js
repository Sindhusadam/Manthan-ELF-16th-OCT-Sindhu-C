var colors = ["pink", "blue", "green","red","yellow","black"]; //colors array
var colorIndex = 0;                                            //initialising the index to 0
function changeColor() {                                       //function
var col = document.getElementById("body");                    //calling the method
if( colorIndex >= colors.length ) {                            //conditional statemt 
    colorIndex = 0;
     }
col.style.backgroundColor = colors[colorIndex];
colorIndex++;                                                  //increments the value of color index
        }