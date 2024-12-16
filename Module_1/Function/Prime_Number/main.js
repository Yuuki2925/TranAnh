function isPrime(number) {
    number = parseInt(prompt("Nhập vào số của bạn: "));
    if (number < 2) {
        alert("Nhập lại giá trị cần kiểm tra !");
        return;
    }
    for (let i = 2; i <= Math.sqrt(number); i++) {
        if (number % i === 0) {
            alert(number + " không phải là số nguyên tố");
            return;
        }
    }
    alert(number + " là số nguyên tố")
}

isPrime();