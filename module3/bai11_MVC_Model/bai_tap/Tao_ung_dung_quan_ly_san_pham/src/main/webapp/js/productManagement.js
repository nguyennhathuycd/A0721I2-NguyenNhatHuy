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

    $(".edit").click(function () {
        $("input[name = 'id']").val($(this).data("id"));
        $("input[name = 'name']").val($(this).data("name"));
        $("input[name = 'price']").val($(this).data("price"));
        $("textarea[name = 'description']").val($(this).data("description"));
        $("input[name = 'manufacture']").val($(this).data("manufacture"));
    });

    $(".delete").click(function () {
        $("input[name='id']").val($(this).data("id"));
    })
});