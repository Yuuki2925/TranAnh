function clickHere(active) {
    if (active == "clickYes") {
        alert("You're my girlfriend");
    } else if (active == "clickNo") {
        var a = Math.floor(Math.random() * (window.innerWidth - 100));
        var b = Math.floor(Math.random() * (window.innerHeight - 100));
        document.getElementById('No').style.left = a + 'px';
        document.getElementById('No').style.top = b + 'px';
    }
}