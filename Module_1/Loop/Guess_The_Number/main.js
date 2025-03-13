function Clickk() {
    let maxRange = Number(prompt("Nhập số bạn muốn đoán trong khoảng lớn nhất là bao nhiêu?"));
    if (isNaN(maxRange) || maxRange <= 0) {
        alert("Vui lòng nhập một số hợp lệ lớn hơn 0!");
        return;
    }
    let res = Math.floor(Math.random() * maxRange);
    let num = 3;
    let cnt = 0;
    while (num > 0) {
        let guess = Number(prompt(`Nhập số bạn đoán (${num}):`));
        if (isNaN(guess)) {
            alert("Vui lòng nhập một số hợp lệ!");
            continue;
        }
        cnt++;
        if (guess === res) {
            alert(`Chúc mừng! Bạn đã đoán đúng số sau ${cnt} lần!`);
            return;
        } else if (guess < res) {
            alert("Số bạn nhập nhỏ hơn kết quả.");
        } else {
            alert("Số bạn nhập lớn hơn kết quả.");
        }

        num--;
    }
    alert(`Bạn đã hết số lần đoán! Số đúng là: ${res}`);
}