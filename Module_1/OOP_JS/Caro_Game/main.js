class CaroGame {
    constructor(size) {
        this.size = size;
        this.board = [];
        this.currentPlayer = "X";
        this.isGameOver = false;

        this.gameElement = document.getElementById("game");
        this.statusElement = document.getElementById("status");
        this.restartButton = document.getElementById("restartButton");

        this.restartButton.addEventListener("click", () => this.restart());
        this.initBoard();
        this.renderBoard();
    }

    initBoard() {
        this.board = Array.from({ length: this.size }, () =>
            Array(this.size).fill("")
        );
    }

    renderBoard() {
        this.gameElement.innerHTML = "";
        for (let row = 0; row < this.size; row++) {
            for (let col = 0; col < this.size; col++) {
                const cell = document.createElement("div");
                cell.classList.add("cell");
                cell.dataset.row = row;
                cell.dataset.col = col;
                cell.addEventListener("click", () => this.handleCellClick(row, col));
                this.gameElement.appendChild(cell);
            }
        }
    }

    handleCellClick(row, col) {
        if (this.isGameOver || this.board[row][col] !== "") return;

        this.board[row][col] = this.currentPlayer;
        this.updateCell(row, col);

        if (this.checkWin(row, col)) {
            this.statusElement.textContent = `Người chơi ${this.currentPlayer} thắng!`;
            this.isGameOver = true;
            this.restartButton.style.display = "inline-block";
        } else {
            this.currentPlayer = this.currentPlayer === "X" ? "O" : "X";
            this.statusElement.textContent = `Lượt của người chơi ${this.currentPlayer}`;
        }
    }

    updateCell(row, col) {
        const cells = document.querySelectorAll(".cell");
        const cell = Array.from(cells).find(
            (c) =>
                c.dataset.row == row && c.dataset.col == col
        );
        cell.textContent = this.board[row][col];
        cell.classList.add("taken");
    }

    checkWin(row, col) {
        const directions = [
            { dr: 0, dc: 1 }, // Horizontal
            { dr: 1, dc: 0 }, // Vertical
            { dr: 1, dc: 1 }, // Diagonal \
            { dr: 1, dc: -1 } // Diagonal /
        ];

        for (const { dr, dc } of directions) {
            let count = 1;
            count += this.countDirection(row, col, dr, dc);
            count += this.countDirection(row, col, -dr, -dc);
            if (count >= 5) return true;
        }

        return false;
    }

    countDirection(row, col, dr, dc) {
        let count = 0;
        let r = row + dr;
        let c = col + dc;

        while (
            r >= 0 &&
            r < this.size &&
            c >= 0 &&
            c < this.size &&
            this.board[r][c] === this.currentPlayer
            ) {
            count++;
            r += dr;
            c += dc;
        }

        return count;
    }

    restart() {
        this.initBoard();
        this.renderBoard();
        this.currentPlayer = "X";
        this.isGameOver = false;
        this.statusElement.textContent = `Lượt của người chơi ${this.currentPlayer}`;
        this.restartButton.style.display = "none";
    }
}

// Khởi tạo game
new CaroGame(20);
