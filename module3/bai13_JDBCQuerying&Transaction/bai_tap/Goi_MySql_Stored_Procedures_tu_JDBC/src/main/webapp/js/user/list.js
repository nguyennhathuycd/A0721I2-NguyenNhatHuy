$(document).ready(function(){
    // Activate tooltip
    $('[data-toggle="tooltip"]').tooltip();

    // Select/Deselect checkboxes
    var checkbox = $('table tbody input[type="checkbox"]');
    $("#selectAll").click(function(){
        if(this.checked){
            checkbox.each(function(){
                this.checked = true;
            });
        } else{
            checkbox.each(function(){
                this.checked = false;
            });
        }
    });
    checkbox.click(function(){
        if(!this.checked){
            $("#selectAll").prop("checked", false);
        }
    });

    $(".delete").click( function () {
        let id = $(this).attr("data-id");
        $('input[name="id"]').val(id);
    })

    $(".edit").click( function () {
        let id = $(this).attr("data-id");
        let name = $(this).attr("data-name");
        let email = $(this).attr("data-email");
        let country = $(this).attr("data-country");

        $('input[name="id"]').val(id);
        $('input[name="name"]').val(name);
        $('input[name="email"]').val(email);
        $('input[name="country"]').val(country);
    })
});