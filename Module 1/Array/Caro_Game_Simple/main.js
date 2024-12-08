let board = [];
let data = "";
for (let i = 0; i < 5; i++) {
    board[i] = [];
    for (let j = 0; j < 5; j++) {
        board[i][j] = "0";
        data += board[i][j] + " &nbsp;&nbsp;";
    }
    data += "<br>";
}
document.getElementById("carogame").innerHTML = data;

function changeValue() {
    let positionX = parseInt(prompt("Nhập X:"));
    let positionY = parseInt(prompt("Nhập Y:"));
    data = "";
    board[positionX][positionY] = "x";
    for (let i = 0; i < 5; i++) {
        for (let j = 0; j < 5; j++) {
            data += board[i][j] + " &nbsp;&nbsp;";
        }
        data += "<br>";
    }
    document.getElementById("carogame").innerHTML = data;
}
