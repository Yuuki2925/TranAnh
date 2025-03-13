//Tính điểm trung bình
function Average(){
    let ly = Number(document.getElementById("number1").value);
    let hoa = Number(document.getElementById("number2").value);
    let sinh = Number(document.getElementById("number3").value);
    let res = (ly + hoa + sinh) / 3;
    document.getElementById("result1").innerHTML = "<b>Result: </b>" + res;
}

//Chuyển độ C sang độ F
function Convert(){
    let C = Number(document.getElementById("celsius").value);
    let F = (C * 9) / 5 + 32;
    document.getElementById("result2").innerHTML = "<b>Result: </b>" + F;
}

//Tính diên tích hình tròn
const PI = 3.14;
function Area(){
    let r = Number(document.getElementById("circle1").value);
    let res = r * r * PI;
    document.getElementById("result3").innerHTML = "<b>Result: </b>" + res;
}

//Tính chu vi hình tròn
function Perimete(){
    let d = Number(document.getElementById("circle2").value);
    let res = d * PI;
    document.getElementById("result4").innerHTML = "<b>Result: </b>" + res;
}

function Reset1(){
    document.getElementById("number1").value = "";
    document.getElementById("number2").value = "";
    document.getElementById("number3").value = "";
    document.getElementById("result1").innerHTML = "";
}

function Reset2(){
    document.getElementById("celsius").value = "";
    document.getElementById("result2").innerHTML = "";
}

function Reset3(){
    document.getElementById("circle1").value = "";
    document.getElementById("result3").innerHTML = "";
}

function Reset4(){
    document.getElementById("circle2").value = "";
    document.getElementById("result4").innerHTML = "";
}
