function footToMeter(foot) {
    foot = parseInt(prompt("Nhập số feet: "));
    let meters = foot * 0.305;
    document.write("meters = " + meters.toFixed(3));
}

function meterToFoot(meter) {
    meter = parseInt(prompt("Nhập số meter: "));
    let foot = meter * 3.279;
    document.write("feet = " + foot.toFixed(3));
}

footToMeter();
document.write("<br>")
meterToFoot();