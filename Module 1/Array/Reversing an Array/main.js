let a = [-3, 5, 1, 3, 2, 10];
let first = 0;
let last = a.length - 1;
while (first < last){
    let tmp = a[first];
    a[first] = a[last];
    a[last] = tmp;
    first++;
    last--;
}
document.getElementById("res").innerHTML = "Reverse = " + a;