let add_array = [];
function Add_Element_Array() {
    let array = document.getElementById("array").value;
    add_array.push(array);
    alert("Added Element: " + array);
    document.getElementById("array").value = "";
}

function Display_Element_Array() {
        let a = "<br> Elements in Array: <hr>";
        for (let i = 0; i < add_array.length; i++) {
            a += "Element " + (i + 1) + "= " + add_array[i] + "<br>" + '<hr>';
        }
        document.getElementById("res").innerHTML = a;
}

function Sort_Array(){
    add_array.sort(function (a,  b){
        return a - b;
    });
    let sortedElements = "<br>Sorted Array: <hr>";
    for (let i = 0; i < add_array.length; i++) {
        sortedElements += "Element " + (i + 1) + " = " + add_array[i] + "<br><hr>";
    }
    document.getElementById("res").innerHTML = sortedElements;
}

function Reverse_Array(){
    add_array.reverse();
    let reverseElements = "<br> Reverse Array: <hr>";
    for(let i = 0; i < add_array.length; i++){
        reverseElements += "Element " + (i + 1) + "= " + add_array[i] + "<br><hr>";
    }
    document.getElementById("res").innerHTML = reverseElements;
}
