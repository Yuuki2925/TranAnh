let value = Number(prompt("Nhập số: "));
let number = [-3, 5, 1, 3, 2, 10];
let found = false;
for (let i = 0; i < number.length; i++) {
    if (value == number[i]) {
        alert("Position: " + i);
        found = true;
    }
}
if (!found) {
    alert("Not found!");
}