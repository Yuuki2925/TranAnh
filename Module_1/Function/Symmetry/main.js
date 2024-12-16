function isPalindrome(text) {
    var cleanText = text.replace(/\s+/g, '').toLowerCase();
    var start = 0;
    var end = cleanText.length - 1;
    while (start < end) {
        if (cleanText[start] !== cleanText[end]) {
            return false;
        }
        start++;
        end--;
    }

    return true;
}

var text = prompt("Nhập vào chuỗi của bạn:");
if (text === null || text.trim() === "") {
    document.write("Bạn chưa nhập chuỗi hợp lệ!");
} else if (isPalindrome(text)) {
    document.write("Là từ đối xứng");
} else {
    document.write("Không là từ đối xứng");
}