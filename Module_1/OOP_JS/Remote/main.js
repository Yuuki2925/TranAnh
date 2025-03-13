class Remote {
    constructor(code) {
        this.code = code;
    }

    changeChannel(tv, direction) {
        tv.changeChannel(direction);
    }

    changeVolume(tv, direction) {
        tv.changeVolume(direction);
    }

    turnOff(tv) {
        tv.setStatus("tắt");
    }

    turnOn(tv) {
        tv.setStatus("bật");
    }
}

class TiVi {
    constructor() {
        this.channel = 1;
        this.volume = 10;
        this.status = "tắt";
    }

    changeChannel(direction) {
        if (this.status === "bật") {
            if (direction === "up") {
                this.channel += 1;
            } else if (direction === "down" && this.channel > 1) {
                this.channel -= 1;
            }
            this.displayLog(`Chuyển đến kênh ${this.channel}`);
        } else {
            this.displayLog("Tivi đã tắt, không thể chuyển kênh.");
        }
    }

    changeVolume(direction) {
        if (this.status === "bật") {
            if (direction === "up") {
                this.volume += 1;
            } else if (direction === "down" && this.volume > 0) {
                this.volume -= 1;
            }
            this.displayLog(`Âm lượng hiện tại là: ${this.volume}`);
        } else {
            this.displayLog("Tivi đã tắt, không thể thay đổi âm lượng.");
        }
    }

    setStatus(status) {
        this.status = status;
        this.displayLog(`Tivi đã ${this.status}`);
    }

    displayLog(message) {
        let logDiv = document.getElementById("log");
        let newLog = document.createElement("p");
        newLog.textContent = message;
        logDiv.appendChild(newLog);
    }
}

// Khởi tạo tivi và remote
let myTV = new TiVi();
let myRemote = new Remote("RMT123");

document.getElementById("powerButton").addEventListener("click", function () {
    myRemote.turnOn(myTV);
});

document.getElementById("turnOffButton").addEventListener("click", function () {
    myRemote.turnOff(myTV);
});

document.getElementById("channelUpButton").addEventListener("click", function () {
    myRemote.changeChannel(myTV, "up");
});

document.getElementById("channelDownButton").addEventListener("click", function () {
    myRemote.changeChannel(myTV, "down");
});

document.getElementById("volumeUpButton").addEventListener("click", function () {
    myRemote.changeVolume(myTV, "up");
});

document.getElementById("volumeDownButton").addEventListener("click", function () {
    myRemote.changeVolume(myTV, "down");
});
