let board = [];
let h = 1;
for (let i = 0; i < 3; i++) {
    board[i] = [];
    for (let j = 0; j < 3; j++) {
        board[i][j] = "&nbsp";
    }
}

function renderBoard() {
    let tableHTML = "<table border='1' style='border-collapse: collapse; text-align: center; width: 300px; height: 300px; font-size: 50px'>";
    for (let i = 0; i < 3; i++) {
        tableHTML += "<tr>";
        for (let j = 0; j < 3; j++) {
            tableHTML += `<td>${board[i][j]}</td>`;
        }
        tableHTML += "</tr>";
    }
    tableHTML += "</table>";
    document.getElementById("gemm").innerHTML = tableHTML;
}

function Convert() {
    let nhapX = parseInt(prompt("Nhập tọa độ X (0-2): "));
    let nhapY = parseInt(prompt("Nhập tọa độ Y (0-2): "));
    if (isNaN(nhapX) || isNaN(nhapY) || nhapX < 0 || nhapX > 2 || nhapY < 0 || nhapY > 2) {
        alert("Tọa độ không hợp lệ. Vui lòng nhập lại!");
        return;
    }
    if (board[nhapX][nhapY] !== "&nbsp") {
        alert("Vị trí này đã được đánh dấu. Chọn vị trí khác!");
        return;
    }

    board[nhapX][nhapY] = (h % 2 === 0) ? "x" : "o";
    h++;
    renderBoard();
    checkWinner();
}

function checkWinner() {
    // Kiểm tra hàng ngang, dọc và chéo
    for (let i = 0; i < 3; i++) {
        // Kiểm tra hàng ngang
        if (board[i][0] !== "&nbsp" && board[i][0] === board[i][1] && board[i][1] === board[i][2]) {
            alert(board[i][0] + " Thắng");
            return;
        }
        // Kiểm tra hàng dọc
        if (board[0][i] !== "&nbsp" && board[0][i] === board[1][i] && board[1][i] === board[2][i]) {
            alert(board[0][i] + " Thắng");
            return;
        }
    }
    // Kiểm tra đường chéo chính
    if (board[0][0] !== "&nbsp" && board[0][0] === board[1][1] && board[1][1] === board[2][2]) {
        alert(board[0][0] + " Thắng");
        return;
    }
    // Kiểm tra đường chéo phụ
    if (board[0][2] !== "&nbsp" && board[0][2] === board[1][1] && board[1][1] === board[2][0]) {
        alert(board[0][2] + " Thắng");
        return;
    }
}

renderBoard();
