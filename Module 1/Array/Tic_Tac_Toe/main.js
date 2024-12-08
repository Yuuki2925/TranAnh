let board = [];
let save = "";
let currentPlayer = "X";
for (let i = 0; i < 3; i++) {
    board[i] = [];
    for (let j = 0; j < 3; j++) {
        board[i][j] = '(.)';
        save += board[i][j] + "&nbsp;&nbsp"
    }
    save += "<br>";
    document.getElementById("res").innerHTML = save;
}

function ChangeValue() {
    let row, col;
    do {
        row = parseInt(prompt("Nhập X (hàng, từ 0 đến 2):"));
        col = parseInt(prompt("Nhập Y (cột, từ 0 đến 2):"));
        if (isNaN(row) || isNaN(col) || row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] !== '(.)') {
            alert("Tọa độ không hợp lệ hoặc ô đã được chọn. Vui lòng thử lại!");
        } else {
            break;
        }
    } while (true);
    save = "";
    board[row][col] = currentPlayer;
    currentPlayer = currentPlayer === "X" ? "O" : "X";
    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            save += board[i][j] + "&nbsp;&nbsp";
        }
        save += "<br>";
    }
    document.getElementById("res").innerHTML = save;
    CheckWinner();
}

function CheckWinner() {
    for (let i = 0; i < 3; i++) {
        if (board[i][0] === board[i][1] && board[i][1] === board[i][2] && board[i][0] !== '(.)') {
            alert(`${board[i][0]} là người chiến thắng!`);
            Reset();
            return;
        }
    }

    for (let j = 0; j < 3; j++) {
        if (board[0][j] === board[1][j] && board[1][j] === board[2][j] && board[0][j] !== '(.)') {
            alert(`${board[0][j]} là người chiến thắng!`);
            Reset();
            return;
        }
    }

    if (board[0][0] === board[1][1] && board[1][1] === board[2][2] && board[0][0] !== '(.)') {
        alert(`${board[0][0]} là người chiến thắng!`);
        Reset();
        return;
    }

    if (board[0][2] === board[1][1] && board[1][1] === board[2][0] && board[0][2] !== '(.)') {
        alert(`${board[0][2]} là người chiến thắng!`);
        Reset();
        return;
    }

    let isDraw = true;
    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            if (board[i][j] === '(.)') {
                isDraw = false;
                break;
            }
        }
    }
    if (isDraw) {
        alert("Trò chơi hòa!");
        Reset();
    }
}

function Reset() {
    save = "";
    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 3; j++) {
            board[i][j] = '(.)';
            save += board[i][j] + "&nbsp;&nbsp";
        }
        save += "<br>";
    }
    document.getElementById("res").innerHTML = save;
    alert("Bảng đã được làm mới, bắt đầu lại trò chơi!");
}

