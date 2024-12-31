function Apple() {
    this.weightApple = 10;

    this.eatApple = function () {
        if (this.weightApple > 0) {
            this.weightApple -= 1;
            return "Khối lượng quả táo còn: " + this.weightApple + "gr"
        } else {
            alert("KHông còn táo!")
        }
    }
}

function Human(name, gender, weight) {
    this.name = name;
    this.gender = gender;
    this.weight = weight;
    this.introduction = function () {
        return "Đây là " + this.name + "<br>"
            + "Giới tính của " + this.name + " là: " + this.gender + "<br>"
            + "Trọng lượng cơ thể của " + this.name + " là: " + this.weight + "kg" + "<br>";
    };
    this.changeWeight = function () {
        this.weight = this.weight + 1;
        return "Khối lượng của " + this.name + " hiện tại là: " + this.weight + "kg";
    }
}

let Human1 = new Human('Adam', 'Nam', 60);
let Human2 = new Human('Eva', 'Nữ', 50)
let myApple = new Apple();
document.write(Human1.introduction());
document.write("<br>");
document.write(Human2.introduction());
document.write("<br>");
document.write("Khối lượng quả táo ban đầu là:" + myApple.weightApple + "gr" + "<br>" + "<br>")
for (let i = 1; i <= 11; i++) {
    if (myApple.weightApple > 0) {
        document.write(Human1.name + " ăn miếng táo thứ " + i + "<br>");
        i++;
        document.write(myApple.eatApple() + "<br>")
        document.write(Human1.changeWeight() + "<br>" + "<br>")
        document.write(Human2.name + " ăn miếng táo thứ " + i + "<br>")
        document.write(myApple.eatApple() + "<br>")
        document.write(Human2.changeWeight() + "<br>" + "<br>");
    } else {
        document.write("Đã hết táo!")
    }
}