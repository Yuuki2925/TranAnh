function isPalindrome(str){
    let arr = str.split("");
    let left = arr[0];
    let right = arr[str.length - 1];
    if(left === right){
        left++;
        right--;
    }
    else {
        return "This Is Not Palindrome";
    }
    return "This is Palindrome";
}
let str = prompt("Nhập chuỗi:");
alert(isPalindrome(str));