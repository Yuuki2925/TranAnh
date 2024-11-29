function Translate() {
    let inputWord = document.getElementById("translate").value.trim().toLowerCase();
    let eng_arr = ["apple", "banana", "mango", "lemon", "cat", "dog"];
    let vie_arr = ["táo", "chuối", "xoài", "chanh", "mèo", "chó"];
    let translation = "Không tìm thấy từ này trong từ điển.";

    for (let i = 0; i < eng_arr.length; i++) {
        if (eng_arr[i] === inputWord) {
            translation = vie_arr[i];
            break;
        }
        else if(vie_arr[i] === inputWord){
            translation = eng_arr[i];
            break;
        }
    }

    document.getElementById("res").innerText = translation;
}