function sendMail(){
    $(".alert").addClass("hidden");

    var sName = $('#inputName').val(); 
    var sEmail = $('#inputEmail').val();   
    var sMsg = $('#inputMsg').val();

    if( validateName(sName) && validateMsg(sMsg) && validateEmail(sEmail) ) {
        var datos = {
            "nombre" : sName,
            "email" : sEmail,
            "mensaje" : sMsg
        };

        $.ajax({

            data:  datos,
            url:   'include/sendMail.php',
            type:  'post',

            beforeSend: function () {
                $("#sent").removeClass("hidden").fadeIn();
            },

            success:  function (response) {
                alert("El mensaje fue enviado");
                $('#contactForm')[0].reset(); 
                $("#no-name").addClass("hidden").fadeIn();
                $("#sent").addClass("hidden").fadeIn();



            }
        });
    }

}

function validateName(sName){
    if (sName !=null && sName!='')
        return true;
    else { 
        $("#no-name").removeClass("hidden").fadeIn();
        return false;
    }
}


function validateMsg(sMsg){
    if (sMsg !=null && sMsg!='')
        return true;
    else { 
        $("#no-msg").removeClass("hidden").fadeIn();
        return false;
    }
}


function validateEmail(sEmail){
    var filter=/[\w-\.]{3,}@([\w-]{2,}\.)*([\w-]{2,}\.)[\w-]{2,4}/;

    if (sEmail !=null && sEmail !="" && filter.test(sEmail))
        return true;
    else { 
        $("#no-email").removeClass("hidden").fadeIn();
        return false;
    }
}
