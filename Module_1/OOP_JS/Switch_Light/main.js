class LightBulb {
    constructor() {
        this.status = "tắt";
    }

    turnOn() {
        this.status = "bật";
    }

    turnOff() {
        this.status = "tắt";
    }

    getStatus() {
        return this.status;
    }
}

class Switch {
    constructor(lightBulb) {
        this.lightBulb = lightBulb;
    }

    toggle() {
        if (this.lightBulb.getStatus() === "tắt") {
            this.lightBulb.turnOn();
        } else {
            this.lightBulb.turnOff();
        }
    }
}


const lightBulb = new LightBulb();
const lightSwitch = new Switch(lightBulb);
const lightBulbElement = document.getElementById('lightBulb');
const switchButton = document.getElementById('switchBtn');
const statusElement = document.getElementById('status');

switchButton.addEventListener('click', () => {
    lightSwitch.toggle();
    if (lightBulb.getStatus() === "bật") {
        lightBulbElement.classList.add('light-on');
        statusElement.textContent = "Bóng đèn đã bật.";
    } else {
        lightBulbElement.classList.remove('light-on');
        statusElement.textContent = "Bóng đèn đã tắt.";
    }
});
