class Rat {
    constructor(name, weight, speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.status = "sống";
    }

    makeSound() {
        return `${this.name} kêu: "chít, chít"`;
    }
}

class Cat {
    constructor(name, weight, maxSpeed) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    makeSound() {
        return `${this.name} kêu: "meo meo"`;
    }

    catchRat(rat) {
        if (this.maxSpeed > rat.speed) {
            rat.status = "chết";
            return `${this.name} bắt được chuột ${rat.name}!`;
        } else {
            return `${this.name} không thể bắt được chuột ${rat.name} vì tốc độ của chuột nhanh hơn.`;
        }
    }

    eatRat(rat) {
        if (rat.status === "sống") {
            this.weight += rat.weight;
            rat.status = "đã ăn";
            return `${this.name} ăn thịt chuột ${rat.name}. Khối lượng của mèo tăng lên ${this.weight} kg.`;
        } else {
            return `${this.name} không thể ăn chuột ${rat.name} vì nó đã chết.`;
        }
    }
}

let rat1 = new Rat("Chuột 1", 0.2, 5);
let rat2 = new Rat("Chuột 2", 0.3, 3);
let cat = new Cat("Mèo 1", 4, 6);

document.getElementById("startButton").addEventListener("click", function() {
    let logDiv = document.getElementById("log");

    logDiv.innerHTML = `
        <p>${cat.makeSound()}</p>
        <p>${rat1.makeSound()}</p>
        <p>${rat2.makeSound()}</p>
    `;

    logDiv.innerHTML += `<p>${cat.catchRat(rat1)}</p>`;
    logDiv.innerHTML += `<p>${cat.eatRat(rat1)}</p>`;
    logDiv.innerHTML += `<p>${cat.catchRat(rat2)}</p>`;
    logDiv.innerHTML += `<p>${cat.eatRat(rat2)}</p>`;

    logDiv.innerHTML += `<p>Cân nặng của ${cat.name}: ${cat.weight} kg</p>`;
});
