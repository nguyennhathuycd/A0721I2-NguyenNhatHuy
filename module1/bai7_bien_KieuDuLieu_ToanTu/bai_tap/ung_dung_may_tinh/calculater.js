function addition() {
    let number1 = parseInt(document.getElementById("ip_number1").value);
    let number2 = parseInt(document.getElementById("ip_number2").value);
    let result = number1 + number2;
    document.getElementById('ip_KetQua').value = result;
}

function subtraction() {
    let number1 = parseInt(document.getElementById("ip_number1").value);
    let number2 = parseInt(document.getElementById("ip_number2").value);
    let result = number1 - number2;
    document.getElementById('ip_KetQua').value = result;
}

function multiplication() {
    let number1 = parseInt(document.getElementById("ip_number1").value);
    let number2 = parseInt(document.getElementById("ip_number2").value);
    let result = number1 * number2;
    document.getElementById('ip_KetQua').value = result;
}

function divsion() {
    let number1 = parseInt(document.getElementById("ip_number1").value);
    let number2 = parseInt(document.getElementById("ip_number2").value);
    let result = number1 / number2;
    document.getElementById('ip_KetQua').value = result;
}