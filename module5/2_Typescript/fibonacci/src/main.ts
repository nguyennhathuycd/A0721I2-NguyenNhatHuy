function fibonacci(number: number): number {
    if (number <= 2) return 1;
    return fibonacci(number - 1) + fibonacci(number - 2);
}

var sum = 0;
sum = fibonacci(3) + fibonacci(5) + fibonacci(7);
console.log("Tong cac so fibonacci la: " + sum);
