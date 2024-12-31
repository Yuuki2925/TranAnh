let x = Number(prompt("Nhap gia tri cua x: "));
let y = Number(prompt("Nhap gia tri cua y: "));
if(x % y === 0){
    document.write(x + " là bội số của " + y);
}
else{
    document.write(x + " không là bội số của " + y);
}