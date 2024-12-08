function feetToMeter(feet) {
    return feet * 0.3048;
}

function meterToFeet(meter) {
    return meter * 3.279;
}

let feet = Number(prompt("Nhập số feet: "));
let meter = Number(prompt("Nhập số meter: "));

document.write(`${feet} feet = ` + feetToMeter(feet).toFixed(2) + " meter<br>");
document.write(`${meter} meter = ` + meterToFeet(meter).toFixed(2) + " feet");
