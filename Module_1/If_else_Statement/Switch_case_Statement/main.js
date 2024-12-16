function Day() {
    let month = Number(document.getElementById("month").value);
    let year = Number(document.getElementById("year").value);
    switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            document.getElementById("res").innerHTML = "<b>31 ngày</b>";
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            document.getElementById("res").innerHTML = "<b>30 ngày</b>";
            break;
        case 2:
            if ((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0)) {
                document.getElementById("res").innerHTML = "<b>Đây là năm nhuận: </b>" + "29 ngày";
            } else {
                document.getElementById("res").innerHTML = "<b>28 ngày</b>";
            }
    }
}