let x = 0;
let array = Array();

function addarray() {
    array[x] = document.getElementById("textvalue").value;
    alert("Element: " + array[x] + " Added at index " + x);
    x++;
    document.getElementById("textvalue").value = "";
}

function displayarray() {
    let e = "<hr/>";
    for (let i = 0; i < array.length; i++) {
        e += "Element " + i + " = " + array[i] + "<br/>";
    }
    document.getElementById("result").innerHTML = e;
}