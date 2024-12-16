class SnakeGame {
    constructor(canvasId, speedSliderId, speedValueId) {
        this.canvas = document.getElementById(canvasId);
        this.ctx = this.canvas.getContext('2d');
        this.box = 20;
        this.snake = [];
        this.food = {};
        this.score = 0;
        this.d = '';
        this.gameSpeed = 100;
        this.game = null;
        this.speedSlider = document.getElementById(speedSliderId);
        this.speedValue = document.getElementById(speedValueId);
        this.speedSlider.addEventListener('input', this.updateSpeed.bind(this));
        document.addEventListener('keydown', this.direction.bind(this));
        this.initGame();
    }

    updateSpeed() {
        this.gameSpeed = this.speedSlider.value;
        this.speedValue.textContent = this.gameSpeed + "ms";
        this.restartGame();
    }

    initGame() {
        this.snake = [{x: 9 * this.box, y: 10 * this.box}];
        this.food = this.generateFood();
        this.score = 0;
        this.d = '';
        this.restartGame();
    }

    restartGame() {
        clearInterval(this.game);
        this.game = setInterval(this.draw.bind(this), this.gameSpeed);
    }

    direction(event) {
        if (event.keyCode == 37 && this.d != 'RIGHT') {
            this.d = 'LEFT';
        } else if (event.keyCode == 38 && this.d != 'DOWN') {
            this.d = 'UP';
        } else if (event.keyCode == 39 && this.d != 'LEFT') {
            this.d = 'RIGHT';
        } else if (event.keyCode == 40 && this.d != 'UP') {
            this.d = 'DOWN';
        } else if (event.keyCode == 32) {
            this.initGame();
        }
    }

    collision(newHead) {
        for (let i = 0; i < this.snake.length; i++) {
            if (newHead.x == this.snake[i].x && newHead.y == this.snake[i].y) {
                return true;
            }
        }
        return false;
    }

    generateFood() {
        var newFood;
        var isOnSnake;

        do {
            newFood = {
                x: Math.floor(Math.random() * 19 + 1) * this.box,
                y: Math.floor(Math.random() * 19 + 1) * this.box
            };
            isOnSnake = false;
            for (var i = 0; i < this.snake.length; i++) {
                if (newFood.x == this.snake[i].x && newFood.y == this.snake[i].y) {
                    isOnSnake = true;
                    break;
                }
            }

        } while (isOnSnake);

        return newFood;
    }

    draw() {
        this.ctx.fillStyle = 'pink';
        this.ctx.fillRect(0, 0, this.canvas.width, this.canvas.height);

        for (var i = 0; i < this.snake.length; i++) {
            this.ctx.fillStyle = (i == 0) ? 'black' : 'orange';
            this.ctx.strokeStyle = 'pink';
            this.ctx.fillRect(this.snake[i].x, this.snake[i].y, this.box, this.box);
            this.ctx.strokeRect(this.snake[i].x, this.snake[i].y, this.box, this.box);
        }

        this.ctx.fillStyle = 'red';
        this.ctx.fillRect(this.food.x, this.food.y, this.box, this.box);

        var snakeX = this.snake[0].x;
        var snakeY = this.snake[0].y;

        if (this.d == 'LEFT') snakeX -= this.box;
        if (this.d == 'UP') snakeY -= this.box;
        if (this.d == 'RIGHT') snakeX += this.box;
        if (this.d == 'DOWN') snakeY += this.box;

        if (snakeX == this.food.x && snakeY == this.food.y) {
            this.score++;
            this.food = this.generateFood();
        } else {
            this.snake.pop();
        }

        var newHead = {x: snakeX, y: snakeY};

        if (snakeX < 0 || snakeY < 0 || snakeX >= this.canvas.width || snakeY >= this.canvas.height || this.collision(newHead)) {
            clearInterval(this.game);
        }

        this.snake.unshift(newHead);

        this.ctx.fillStyle = 'black';
        this.ctx.font = '45px Changa one';
        this.ctx.fillText(this.score, 2 * this.box, 1.6 * this.box);
    }
}

const game = new SnakeGame('gameCanvas', 'speedSlider', 'speedValue');

// Xử lý sự kiện nhấn nút Reset
document.getElementById('resetButton').addEventListener('click', function () {
    game.initGame();
});
