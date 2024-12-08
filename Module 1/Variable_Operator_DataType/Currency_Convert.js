function convert(a) {
    a.preventDefault();
    let amount = document.getElementById("amount").value;
    let from = document.getElementById("from").value;
    let to = document.getElementById("to").value;
    let res;

    if (from === "USD" && to === "VND") {
        res = "Result: " + amount * 25000 + "VND";
    } else if (from === "VND" && to === "USD") {
        res = "Result: " + amount / 25000 + "$";
    } else if (from === "VND") {
        res = "Result: " + amount + "VND";
    } else {
        res = "Result: " + amount + "$";
    }

    document.getElementById("result").innerHTML = "<h3>" + res + "</h3>";
}