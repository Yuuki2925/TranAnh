let display = document.getElementById("display");

function Input(input) {
    display.value += input;
}

function clearDisplay() {
    display.value = '';
}

function calculateResult() {
    let result = eval(display.value);
    display.value = result;
}