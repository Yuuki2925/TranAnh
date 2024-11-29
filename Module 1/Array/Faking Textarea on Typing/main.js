const text = "Tôi là con lợn!!";
let index = 0;

document.addEventListener("keydown", function() {
    if (index < text.length) {
        document.getElementById("output").innerHTML += text[index];
        index++;
    } else {
        index = 0;
        document.getElementById("output").innerText = "";
    }
});