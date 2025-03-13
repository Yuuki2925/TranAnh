let myNokia = function () {
    this.Pin = 100;
    this.Box = [];
    this.On = false;

    this.But1 = function () {
        if (this.Pin > 0) {
            this.On = !this.On;
            this.Pin -= 1;
            return this.On;
        } else {
            alert("Pin yếu, không thể bật!");
            return false;
        }
    };
    this.displayPin = function () {
        document.getElementById("Pin").innerText = this.Pin + "%";
        if (this.Pin <= 0) {
            alert("Pin yếu!");
        }
    };
    this.sendMessage = function (message) {
        if (this.Pin > 0 && this.On) {
            this.Box.push(message + "\n");
            this.Pin -= 1;
            alert("Đã gửi!")
        } else {
            alert("Chưa bật máy!")
        }
    };
    this.viewBoxMess = function () {
        if (this.On && this.Pin > 0) {
            document.getElementById("boxMess").innerText = this.Box.join(" ");
        } else {
            document.getElementById("boxMess").innerText = "Rỗng"
        }
    };
    this.Energy = function () {
        if (this.On) {
            if (this.Pin < 100) {
                this.Pin += 1;
                if (this.Pin > 100) {
                    this.Pin = 100;
                }
            } else {
                alert("Pin đầy không cần sạc!")
            }
            this.displayPin();
        } else {
            alert("Bật máy để sạc")
        }
    };
    this.Inbox = function () {
        if (this.On && this.Pin > 0) {
            return this.Box;
        } else {
            alert("Chưa bật máy");
        }
    }
}
let avt = new myNokia();
avt.displayPin();

function Click1() {
    let click = avt.But1();
    if (click) {
        document.getElementById("display").innerText = "Điện thoại BẬT";
    } else {
        document.getElementById("display").innerText = "Điện thoại TẮT";
    }
    avt.displayPin();
}

function Button2() {
    let message = prompt("Nhập tin nhắn: ");
    if (message) {
        avt.sendMessage(message);
        avt.displayPin();
    }
}

function Button4() {
    avt.viewBoxMess();
    avt.displayPin();
}

function Button3() {
    let Inbox = Iphone.InboxIphone();
    document.getElementById("Inbox").innerText = Inbox.join(" ");
    avt.displayPin()
}

function Energy() {
    avt.Energy();
    avt.displayPin();
}


let myIphone = function () {
    this.Pin = 100;
    this.Box = [];
    this.On = false;

    this.But1 = function () {
        if (this.Pin > 0) {
            this.On = !this.On;
            this.Pin -= 1;
            return this.On;
        } else {
            alert("Pin yếu, không thể bật!");
            return false;
        }
    };
    this.displayPin = function () {
        document.getElementById("myPin").innerText = this.Pin + "%";
        if (this.Pin <= 0) {
            alert("Pin yếu!");
        }
    };
    this.sendMessage = function (mess) {
        if (this.Pin > 0 && this.On) {
            this.Box.push(mess + "\n");
            this.Pin -= 1;
            alert("Đã gửi!")
        } else {
            alert("Chưa bật máy!")
        }
    };
    this.viewBoxMess = function () {
        if (this.On && this.Pin > 0) {
            document.getElementById("boxMessIphone").innerText = this.Box.join(" ");
        } else {
            document.getElementById("boxMessIphone").innerText = "Rỗng"
        }
    };
    this.Change = function () {
        if (this.On) {
            if (this.Pin < 100) {
                this.Pin += 1;
                if (this.Pin > 100) {
                    this.Pin = 100;
                }
            } else {
                alert("Pin đầy không cần sạc!")
            }
            this.displayPin();
        } else {
            alert("Bật máy để sạc")
        }
    };
    this.InboxIphone = function () {
        if (this.On && this.Pin > 0) {
            return this.Box;
        } else {
            alert("Chưa bật máy!");
        }
    }
}
let Iphone = new myIphone();
Iphone.displayPin();

function Click() {
    let click = Iphone.But1();
    if (click) {
        document.getElementById("output").innerText = "Điện thoại BẬT";
    } else {
        document.getElementById("output").innerText = "Điện thoại TẮT";
    }
    Iphone.displayPin();
}

function Button6() {
    let mess = prompt("Nhập tin nhắn: ");
    if (mess) {
        Iphone.sendMessage(mess);
        Iphone.displayPin();
    }
}

function Button8() {
    Iphone.viewBoxMess();
    Iphone.displayPin();
}

function Change() {
    Iphone.Change();
    Iphone.displayPin();
}

function Button7() {
    let InboxIphone = avt.Inbox();
    document.getElementById("InboxIphone").innerText = InboxIphone.join(" ");
    Iphone.displayPin();
}