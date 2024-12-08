function Confirm(answer) {
    let res = "";
    if (answer) {
        res = "Excellent. We'll play a nice game of chess.";
    } else {
        res = "Maybe later then.";
    }
    return res;
}

let confirmAns = confirm("Shall we play a game?");
let theAns = Confirm(confirmAns);
alert(theAns);