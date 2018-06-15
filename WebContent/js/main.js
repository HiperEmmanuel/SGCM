window.addEventListener('load', function(){
    document.getElementById('ingresar').addEventListener('click', function(){
        var email = document.getElementById('txtemail').value;
        var pass = document.getElementById('txtpass').value;

        var bandera = false;

        if (email.length > 0 && pass.length > 0) {
            bandera = true;
        }
        if (bandera){
            document.getElementById('formLogin').submit();
        } else {
            alert ('No se ingresó email/contraseña');
        }
        
    })
})