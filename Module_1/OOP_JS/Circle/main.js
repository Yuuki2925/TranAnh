let Circle = function (radius) {
    this.radius = radius;
    this.getRadius = function () {
        return this.radius;
    }
    this.getArea = function () {
        return Math.PI * radius * radius;
    }
};
let circle = new Circle(2);
let radius = circle.getRadius();
let area = circle.getArea();
alert("radius: " + radius + "; area: " + area);
let Circle2 = function (r) {
    this.r = r;
    this.gerR = function () {
        return this.r;
    }
    this.getS = function () {
        return Math.PI * r * r;
    }
}
let circle2 = new Circle2(10);
let banKinh = circle2.gerR();
let dienTich = circle2.getS();
alert("Bán kính: " + banKinh + "; Diện tích: " + dienTich);