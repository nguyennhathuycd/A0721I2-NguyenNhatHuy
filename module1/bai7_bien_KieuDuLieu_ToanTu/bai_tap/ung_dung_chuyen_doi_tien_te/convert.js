function convert() {
    let amount = parseInt(document.getElementById("ip_amount").value);
    let from_currency = document.getElementById("sl_form_currency").value;
    let to_currency = document.getElementById("sl_to_currency").value;
    let result;

    if (from_currency == 'VietNam' && to_currency == 'USD'){
        result = amount / 23000;
        alert('Result: ' + result + '$');
    } else if (from_currency == 'USD' && to_currency == 'VietNam'){
        result = amount * 23000;
        alert('Result: ' + result + 'VNĐ');
    } else if (from_currency == 'VietNam'){
        result = amount;
        alert('Result: ' + result + 'VNĐ');
    }
    else {
        result = amount;
        alert('Result: ' + result + '$');
    }
}