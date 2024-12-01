function Min(arr){
    let min = arr[0];
    for(let i = 1; i < arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    return min;
}
let nums = parseInt(prompt("Nhập số phần tử trong mảng: "));
let arr = [];
for(let i = 0; i < nums; i++){
    arr[i] = parseInt(prompt("Nhập phần tử: " + i));
}
let minValue = Min(arr);
document.getElementById("res").innerHTML = "Giá trị nhỏ nhất trong mảng là: " + minValue;

