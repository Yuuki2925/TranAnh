class GameObject {
    constructor(x, y, width, height, color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    draw(ctx) {
        ctx.fillStyle = this.color;
        ctx.fillRect(this.x, this.y, this.width, this.height);
    }

    intersects(other) {
        return (
            this.x < other.x + other.width &&
            this.x + this.width > other.x &&
            this.y < other.y + other.height &&
            this.y + this.height > other.y
        );
    }
}

class Car extends GameObject {
    constructor(x, y) {
        super(x, y, 30, 50, "blue");
        this.speed = 2;
        this.dx = 0;
        this.dy = -this.speed;
    }

    update(keys, canvasWidth, canvasHeight) {
        if (keys.ArrowUp) {
            this.dy = -this.speed;
            this.dx = 0;
        }
        if (keys.ArrowDown) {
            this.dy = this.speed;
            this.dx = 0;
        }
        if (keys.ArrowLeft) {
            this.dx = -this.speed;
            this.dy = 0;
        }
        if (keys.ArrowRight) {
            this.dx = this.speed;
            this.dy = 0;
        }
        if (keys.Control) {
            this.speed = 4;
        } else {
            this.speed = 2;
        }

        // Di chuyển xe
        this.x += this.dx;
        this.y += this.dy;

        // Kiểm tra biên và đưa xe ra phía đối diện
        if (this.x < 0) this.x = canvasWidth - this.width;
        if (this.x + this.width > canvasWidth) this.x = 0;
        if (this.y < 0) this.y = canvasHeight - this.height;
        if (this.y + this.height > canvasHeight) this.y = 0;
    }
}

class Game {
    constructor(canvas) {
        this.canvas = canvas;
        this.ctx = canvas.getContext("2d");
        this.car = new Car(200, 200);
        this.obstacles = [];
        this.rewards = [];
        this.keys = {};
        this.score = 0;
        this.running = true;

        this.spawnObstacles();
        this.spawnRewards();

        window.addEventListener("keydown", (e) => (this.keys[e.key] = true));
        window.addEventListener("keyup", (e) => (this.keys[e.key] = false));
        this.restartButton = document.getElementById("restartButton");
        this.restartButton.addEventListener("click", () => this.restart());
    }

    spawnObstacles() {
        for (let i = 0; i < 5; i++) {
            this.obstacles.push(
                new GameObject(
                    Math.random() * (this.canvas.width - 40),
                    Math.random() * (this.canvas.height - 40),
                    40,
                    40,
                    "red"
                )
            );
        }
    }

    spawnRewards() {
        for (let i = 0; i < 5; i++) {
            this.rewards.push(
                new GameObject(
                    Math.random() * (this.canvas.width - 20),
                    Math.random() * (this.canvas.height - 20),
                    20,
                    20,
                    "green"
                )
            );
        }
    }

    update() {
        if (!this.running) return;

        // Cập nhật vị trí của xe
        this.car.update(this.keys, this.canvas.width, this.canvas.height);

        // Kiểm tra va chạm với chướng ngại vật
        for (let obstacle of this.obstacles) {
            if (this.car.intersects(obstacle)) {
                this.running = false;
                this.endGame();
                return;
            }
        }

        // Kiểm tra va chạm với phần thưởng
        for (let i = this.rewards.length - 1; i >= 0; i--) {
            if (this.car.intersects(this.rewards[i])) {
                this.rewards.splice(i, 1);
                this.score += 10;
            }
        }
    }

    draw() {
        this.ctx.clearRect(0, 0, this.canvas.width, this.canvas.height);

        // Vẽ xe
        this.car.draw(this.ctx);

        // Vẽ chướng ngại vật
        for (let obstacle of this.obstacles) {
            obstacle.draw(this.ctx);
        }

        // Vẽ phần thưởng
        for (let reward of this.rewards) {
            reward.draw(this.ctx);
        }

        // Vẽ điểm số
        this.ctx.fillStyle = "black";
        this.ctx.font = "20px Arial";
        this.ctx.fillText(`Score: ${this.score}`, 10, 30);
    }

    loop() {
        this.update();
        this.draw();

        if (this.running) {
            requestAnimationFrame(() => this.loop());
        }
    }

    endGame() {
        alert(`Game Over! Your Score: ${this.score}`);
        this.restartButton.style.display = "block";
    }

    restart() {
        this.car = new Car(200, 200);
        this.obstacles = [];
        this.rewards = [];
        this.keys = {};
        this.score = 0;
        this.running = true;

        this.spawnObstacles();
        this.spawnRewards();
        this.restartButton.style.display = "none";
        this.loop();
    }
}

// Khởi tạo game
const canvas = document.getElementById("gameCanvas");
canvas.width = 400;
canvas.height = 400;

const game = new Game(canvas);
game.loop();
