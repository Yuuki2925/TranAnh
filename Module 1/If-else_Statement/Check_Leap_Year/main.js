function LeapYearr(a) {
    a.preventDefault();
    let year = Number(document.getElementById("leapYear").value);

    if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
        document.getElementById("result").innerHTML = "Đây là năm nhuận";
    } else if (year % 100 == 0 && year % 400 != 0) {
        document.getElementById("result").innerHTML = "Đây không phải năm nhuận";
    } else {
        document.getElementById("result").innerHTML = "Đây không phải năm nhuận";
    }
}