class SnakeGame {
    constructor(canvasId, speedSliderId, speedValueId, scoreDisplayId) {
        this.canvas = document.getElementById(canvasId);
        this.ctx = this.canvas.getContext('2d');
        this.box = 20;
        this.speedSlider = document.getElementById(speedSliderId);
        this.speedValue = document.getElementById(speedValueId);
        this.scoreDisplay = document.getElementById(scoreDisplayId);
        this.gameSpeed = 100;
        this.snake = [];
        this.food = {};
        this.score = 0;
        this.move = "";
        this.game = null;
        this.initControls();
        this.initGame();
    }

    initControls() {
        var self = this;
        this.speedSlider.addEventListener('input', function () {
            self.gameSpeed = self.speedSlider.value;
            self.speedValue.textContent = self.gameSpeed + 'ms';
            self.restartGame();
        });
        document.addEventListener('keydown', function (event) {
            self.direction(event);
        });
    }

    initGame() {
        this.snake = [{x: 9 * this.box, y: 10 * this.box}];
        this.generateFood();
        this.score = 0;
        this.updateScoreDisplay();
        this.move = "";
        this.restartGame();
    }

    restartGame() {
        clearInterval(this.game);
        var self = this;
        this.game = setInterval(function () {
            self.draw();
        }, this.gameSpeed);
    }

    direction(event) {
        if (event.keyCode === 37 && this.move !== 'RIGHT') {
            this.move = 'LEFT';
        } else if (event.keyCode === 38 && this.move !== 'DOWN') {
            this.move = 'UP';
        } else if (event.keyCode === 39 && this.move !== 'LEFT') {
            this.move = 'RIGHT';
        } else if (event.keyCode === 40 && this.move !== 'UP') {
            this.move = 'DOWN';
        } else if (event.keyCode === 32) {
            this.initGame();
        }
    }

    collision(newHead) {
        for (var i = 0; i < this.snake.length; i++) {
            if (newHead.x === this.snake[i].x && newHead.y === this.snake[i].y) {
                return true;
            }
        }
        return false;
    }

    generateFood() {
        do {
            this.food = {
                x: Math.floor(Math.random() * 19 + 1) * this.box,
                y: Math.floor(Math.random() * 19 + 1) * this.box
            };
        } while (this.collision(this.food));
    }

    draw() {
        this.ctx.fillStyle = 'white';
        this.ctx.fillRect(0, 0, this.canvas.width, this.canvas.height);

        for (let i = 0; i < this.snake.length; i++) {
            const randomR = Math.floor(Math.random() * 255);
            const randomG = Math.floor(Math.random() * 255);
            const randomB = Math.floor(Math.random() * 255);
            this.ctx.fillStyle = `rgb(${randomR}, ${randomG}, ${randomB})`;
            this.ctx.fillRect(this.snake[i].x, this.snake[i].y, this.box, this.box);
        }

        this.ctx.fillStyle = "black";
        this.ctx.fillRect(this.food.x, this.food.y, this.box, this.box);

        var snakeX = this.snake[0].x;
        var snakeY = this.snake[0].y;

        if (this.move === 'LEFT') {
            snakeX -= this.box;
        }
        if (this.move === 'UP') {
            snakeY -= this.box;
        }
        if (this.move === 'RIGHT') {
            snakeX += this.box;
        }
        if (this.move === 'DOWN') {
            snakeY += this.box;
        }

        if (snakeX === this.food.x && snakeY === this.food.y) {
            this.score++;
            this.updateScoreDisplay();
            this.generateFood();
        } else {
            this.snake.pop();
        }

        var newHead = {x: snakeX, y: snakeY};

        if (
            snakeX < 0 || snakeY < 0 ||
            snakeX >= this.canvas.width || snakeY >= this.canvas.height ||
            this.collision(newHead)
        ) {
            clearInterval(this.game);
            this.showGameOver();
        }

        this.snake.unshift(newHead);
    }

    updateScoreDisplay() {
        this.scoreDisplay.textContent = 'Score: ' + this.score;
    }

    showGameOver() {
        this.ctx.fillStyle = 'red';
        this.ctx.font = '50px Arial';
        this.ctx.textAlign = 'center';
        this.ctx.fillText('Game Over', this.canvas.width / 2, this.canvas.height / 2);
    }
}

const game = new SnakeGame('gameCanvas', 'speedSlider', 'speedValue', 'scoreDisplay');
