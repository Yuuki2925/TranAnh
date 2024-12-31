let numbers = [-34, 55, 12, 33, 22, 14];
let max = numbers[0];
let index = 0;
for (let i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
        index = i;
    }
}
alert("max: " + max + " at position " + index);