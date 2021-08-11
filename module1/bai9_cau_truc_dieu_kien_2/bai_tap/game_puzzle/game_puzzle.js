function changeImage(id) {
    img = document.getElementById(id);
    switch (id) {
        case 'image1':
            if (img.getAttribute('src') === 'img/funny-cat1_part1x1.jpg')
                img.src = 'img/monkey_part1x1.jpg';
            else if (img.getAttribute('src') == 'img/monkey_part1x1.jpg')
                img.src = 'img/panda_swap_part1x1.jpg'
            else
                img.src = 'img/funny-cat1_part1x1.jpg';
            break;
        case 'image2':
            if (img.getAttribute('src') == 'img/funny-cat1_part2x1.jpg')
                img.src = 'img/monkey_part2x1.jpg';
            else if (img.getAttribute('src') == 'img/monkey_part2x1.jpg')
                img.src = 'img/panda_swap_part2x1.jpg'
            else
                img.src = 'img/funny-cat1_part2x1.jpg';
            break;
        case 'image3':
            if (img.getAttribute('src') == 'img/funny-cat1_part3x1.jpg')
                img.src = 'img/monkey_part3x1.jpg';
            else if (img.getAttribute('src') == 'img/monkey_part3x1.jpg')
                img.src = 'img/panda_swap_part3x1.jpg'
            else
                img.src = 'img/funny-cat1_part3x1.jpg';
            break;
        case 'image4':
            if (img.getAttribute('src') == 'img/funny-cat1_part4x1.jpg')
                img.src = 'img/monkey_part4x1.jpg';
            else if (img.getAttribute('src') == 'img/monkey_part4x1.jpg')
                img.src = 'img/panda_swap_part4x1.jpg'
            else
                img.src = 'img/funny-cat1_part4x1.jpg';
            break;
        case 'image5':
            if (img.getAttribute('src') == 'img/funny-cat1_part5x1.jpg')
                img.src = 'img/monkey_part5x1.jpg';
            else if (img.getAttribute('src') == 'img/monkey_part5x1.jpg')
                img.src = 'img/panda_swap_part5x1.jpg'
            else
                img.src = 'img/funny-cat1_part5x1.jpg';
            break;
    }

    check_result();
}

function check_result() {
    if ((document.getElementById("image1").getAttribute('src') == "img/funny-cat1_part1x1.jpg")
        && (document.getElementById("image2").getAttribute('src') == "img/funny-cat1_part2x1.jpg")
        && (document.getElementById("image3").getAttribute('src') == "img/funny-cat1_part3x1.jpg")
        && (document.getElementById("image4").getAttribute('src') == "img/funny-cat1_part4x1.jpg")
        && (document.getElementById("image5").getAttribute('src') == "img/funny-cat1_part5x1.jpg")) {
        document.getElementById("id_table").style.border = '5px solid red';
    } else if ((document.getElementById("image1").getAttribute('src') == "img/monkey_part1x1.jpg")
        && (document.getElementById("image2").getAttribute('src') == "img/monkey_part2x1.jpg")
        && (document.getElementById("image3").getAttribute('src') == "img/monkey_part3x1.jpg")
        && (document.getElementById("image4").getAttribute('src') == "img/monkey_part4x1.jpg")
        && (document.getElementById("image5").getAttribute('src') == "img/monkey_part5x1.jpg")) {
        document.getElementById("id_table").style.border = '5px solid red';
    }
    else if ((document.getElementById("image1").getAttribute('src') == "img/panda_swap_part1x1.jpg")
        && (document.getElementById("image2").getAttribute('src') == "img/panda_swap_part2x1.jpg")
        && (document.getElementById("image3").getAttribute('src') == "img/panda_swap_part3x1.jpg")
        && (document.getElementById("image4").getAttribute('src') == "img/panda_swap_part4x1.jpg")
        && (document.getElementById("image5").getAttribute('src') == "img/panda_swap_part5x1.jpg")){
        document.getElementById("id_table").style.border = '5px solid red';
    } else {
        document.getElementById("id_table").style.border = '0';
    }
}