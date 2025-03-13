function changeImg(check) {
    let img1 = document.getElementById("pic1");
    let img2 = document.getElementById("pic2");
    let img3 = document.getElementById("pic3");
    let img4 = document.getElementById("pic4");
    let img5 = document.getElementById("pic5");

    if (check === 1) {
        if (img1.src.includes("cat1.jpg")) {
            img1.src = "img/panda1.jpg";
        } else if (img1.src.includes("panda1.jpg")) {
            img1.src = "img/monkey1.jpg";
        } else {
            img1.src = "img/cat1.jpg";
        }
    }
    if (check === 2) {
        if (img2.src.includes("cat2.jpg")) {
            img2.src = "img/panda2.jpg";
        } else if (img2.src.includes("panda2.jpg")) {
            img2.src = "img/monkey2.jpg";
        } else {
            img2.src = "img/cat2.jpg";
        }
    }
    if (check === 3) {
        if (img3.src.includes("cat3.jpg")) {
            img3.src = "img/panda3.jpg";
        } else if (img3.src.includes("panda3.jpg")) {
            img3.src = "img/monkey3.jpg";
        } else {
            img3.src = "img/cat3.jpg";
        }
    }
    if (check === 4) {
        if (img4.src.includes("cat4.jpg")) {
            img4.src = "img/panda4.jpg";
        } else if (img4.src.includes("panda4.jpg")) {
            img4.src = "img/monkey4.jpg";
        } else {
            img4.src = "img/cat4.jpg";
        }
    }
    if (check === 5) {
        if (img5.src.includes("cat5.jpg")) {
            img5.src = "img/panda5.jpg";
        } else if (img5.src.includes("panda5.jpg")) {
            img5.src = "img/monkey5.jpg";
        } else {
            img5.src = "img/cat5.jpg";
        }
    }
}
