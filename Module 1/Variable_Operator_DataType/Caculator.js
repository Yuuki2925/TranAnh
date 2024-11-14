function add(){
    let number1 = Number(document.getElementById("number1").value);
    let number2 = Number(document.getElementById("number2").value);
    let res;
    res = number1 + number2;
    document.getElementById("result").innerHTML = res;
}

function sub(){
    let number1 = Number(document.getElementById("number1").value);
    let number2 = Number(document.getElementById("number2").value);
    let res;
    res = number1 - number2;
    document.getElementById("result").innerHTML = res;
}
function mul(){
    let number1 = Number(document.getElementById("number1").value);
    let number2 = Number(document.getElementById("number2").value);
    let res;
    res = number1 * number2;
    document.getElementById("result").innerHTML = res;
}
function div(){
    let number1 = Number(document.getElementById("number1").value);
    let number2 = Number(document.getElementById("number2").value);
    let res;
    res = number1 / number2;
    document.getElementById("result").innerHTML = res;
}