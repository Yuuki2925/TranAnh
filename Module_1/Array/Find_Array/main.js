let value = prompt("Nhập số a: ");
let numbers = [-3, -4, -1, -2, -5, -7, -10];
let index = -1;
for (let i = 0; i < numbers.length; i++) {
    if (value == numbers[i]) {
        alert("Value " + numbers[i] + " found at " + i);
    }
}
if (index > -1) {
    alert("Value " + value + " found at " + index);
} else {
    alert("Value " + value + "not found");
}