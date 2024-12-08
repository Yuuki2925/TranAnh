function prime(numbers) {
    if (numbers < 2) {
        return false;
    }
    for (let i = 2; i <= Math.sqrt(numbers); i++) {
        if (numbers % i === 0) {
            return false;
        }
    }
    return true;
}

for (let i = 0; i < 10000; i++) {
    if (prime(i)) {
        document.write(i + " ");
    }
}