function check(active) {
    const checkbox1 = document.getElementById('checkbox1');
    const checkbox2 = document.getElementById('checkbox2');
    const checkbox3 = document.getElementById('checkbox3');
    if (active === '3') {
        if (checkbox1.checked && checkbox2.checked) {
            checkbox1.checked = false;
        }
    } else if (active === '1') {
        if (checkbox2.checked && checkbox3.checked) {
            checkbox2.checked = false;
        }
    } else if (active === '2') {
        if (checkbox1.checked && checkbox3.checked) {
            checkbox3.checked = false;
        }
    }
}
