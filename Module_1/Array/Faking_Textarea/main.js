let message = ["T", "ô", "i", " ", "l", "à", " ", "đ", "ồ", " ", "n", "g", "ố", "c"];
let index = 0;
document.addEventListener('keydown', function() {
    let textarea = document.getElementById("output");
    if (index < message.length) {
        textarea.value += message[index];
        index++;
    } else {
        textarea.value = "";
        index = 0;
    }
});