function Convert() {
    let text = document.getElementById("text").value;
    let Eng = ["dog", "cat", "elephant", "tiger", "lion", "giraffe", "zebra", "kangaroo", "panda", "rabbit"];
    let Vie = ["chó", "mèo", "voi", "hổ", "sư tử", "hươu cao cổ", "ngựa vằn", "kangaroo", "gấu trúc", "thỏ"];
    let Value;
    let result = "";

    if (Eng.includes(text)) {
        Value = Eng.indexOf(text);
        result = Vie[Value];
    } else if (Vie.includes(text)) {
        Value = Vie.indexOf(text);
        result = Eng[Value];
    } else {
        result = "Không tìm thấy con vật!";
    }

    document.getElementById("Kq").textContent = result;
}
