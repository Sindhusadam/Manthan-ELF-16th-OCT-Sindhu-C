function outer(){
    let a = 10;

    function inner(){
        console.log(a)
    }
    return inner;
}
let innerfunc = outer();
innerfunc();
