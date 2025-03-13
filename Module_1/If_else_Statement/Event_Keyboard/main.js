let move = document.getElementById("nobita");
move.style.position = 'relative';

function moveRight() {
    move.style.left = parseInt(move.style.left) + 20 + 'px';
}

function moveLeft() {
    move.style.left = parseInt(move.style.left) - 20 + 'px';
}

function moveUp() {
    move.style.top = parseInt(move.style.top) - 20 + 'px';
}

function moveDown() {
    move.style.top = parseInt(move.style.top) + 20 + 'px';
}

function key(evt) {
    switch (evt.keyCode) {
        case 37:
            moveLeft();
            break;
        case 38:
            moveUp();
            break;
        case 39:
            moveRight();
            break;
        case 40:
            moveDown();
            break;
    }
}

window.addEventListener('keydown', key);