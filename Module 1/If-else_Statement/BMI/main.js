function Check() {
    let height = Number(document.getElementById("m").value);
    let weight = Number(document.getElementById("kg").value);
    let bmi = weight / (height ** 2);
    if (bmi < 18.5) {
        document.getElementById("check").innerHTML = "BMI: " + bmi.toFixed(2) + ". Underweight";
    } else if (bmi >= 18.5 && bmi < 25) {
        document.getElementById("check").innerHTML = "BMI: " + bmi.toFixed(2) + ". Normal";
    } else if (bmi >= 25 && bmi < 30) {
        document.getElementById("check").innerHTML = "BMI: " + bmi.toFixed(2) + ". Overweight";
    } else {
        document.getElementById("check").innerHTML = "BMI: " + bmi.toFixed(2) + ". Obese";
    }
}