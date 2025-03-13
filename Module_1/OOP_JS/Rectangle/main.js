function Rectangle(a, b) {
    this.a = a;
    this.b = b;

    this.getCircumference = function () {
        return (this.a + this.b) * 2;
    }
    this.getArea = function () {
        return this.a * this.b;
    }
}

function displayCanvas() {
    let canvas = document.getElementById("myCanvas");
    let ctx = canvas.getContext("2d");
    let a = parseInt(prompt("Nhập vào a: "));
    let b = parseInt(prompt("Nhập vào b: "));
    let rectangle = new Rectangle(a, b);
    ctx.strokeStyle = "black";
    ctx.lineWidth = 1;
    ctx.strokeRect(50, 50, rectangle.a, rectangle.b);
    let chuVi = rectangle.getCircumference();
    document.write("<br>" + "Chu vi hình chữ nhật đó là: " + chuVi + " cm" + "<br>");
    let dienTich = rectangle.getArea();
    document.write("Diện tích hình chữ nhật là: " + dienTich + " cm^2");
}

displayCanvas();