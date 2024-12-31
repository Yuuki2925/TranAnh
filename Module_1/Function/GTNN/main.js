function GTNN(Array) {
    if (Array.length === 0) {
        alert("Xuất hiện mảng rỗng(trả về -1)");
        return -1;
    }
    let min = Array[0];
    for (let i = 0; i < Array.length; i++) {
        if (Array[i] < min) {
            min = Array[i];
        }
    }
    return min;
}

let Array1 = [3, 5, 1, 8, -3, 7, 8];
document.write("Mảng Array1: " + Array1.join(' '));
let minArray1 = GTNN(Array1);
document.write("<br>" + "Giá trị nhỏ nhất trong mảng Array 1 là: " + minArray1 + "<br><br>");
let Array2 = [7, 12, 6, 9, 20, 56, 89];
document.write("Mảng Array2: " + Array2.join(' '));
let minArray2 = GTNN(Array2);
document.write("<br>" + "Giá trị nhỏ nhất trong mảng Array 2 là: " + minArray2 + "<br><br>");
let Array3 = [];
document.write("Mảng Array3: " + Array3.join(' '));
let minArray3 = GTNN(Array3);
document.write("<br>" + "Giá trị nhỏ nhất trong mảng Array 3 là: " + minArray3 + "<br><br>");
let Array4 = [0, 0, 0, 0, 0, 0];
document.write("Mảng Array4: " + Array4.join(' '));
let minArray4 = GTNN(Array4);
document.write("<br>" + "Giá trị nhỏ nhất trong mảng Array 1 là: " + minArray4 + "<br><br>");