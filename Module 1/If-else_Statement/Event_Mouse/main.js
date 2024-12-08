let myimage = document.getElementById("image");

function Click() {
    let currentLeft = parseInt(myimage.style.left) || 0;
    myimage.style.left = currentLeft + 10 + 'px';
}

function Reset() {
    myimage.style.left = '0px';
}

// let imgObj = null;
// imgObj = document.getElementById('image');
// function init() {
//     imgObj = document.getElementById('image');
//     imgObj.style.position = 'relative';
//     imgObj.style.left = '0px';
// }
// function Click() {
//     imgObj.style.left = parseInt(imgObj.style.left) + 10 + 'px';
// }
// function Reset(){
//     imgObj.style.left = '0px';
// }
// window.onload = init;
