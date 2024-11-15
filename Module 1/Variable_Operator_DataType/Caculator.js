let number1 = document.getElementById("number1");
let number2 = document.getElementById("number2");
let res;
function add(){
    res = Number(number1.value) + Number(number2.value);
    document.getElementById("result").innerHTML = res;
}

function sub(){
    res = Number(number1.value) - Number(number2.value);
    document.getElementById("result").innerHTML = res;
}
function mul(){
    res = Number(number1.value) * Number(number2.value);
    document.getElementById("result").innerHTML = res;
}
function div(){
    res = Number(number1.value) / Number(number2.value);
    document.getElementById("result").innerHTML = res;
}