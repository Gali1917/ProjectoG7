function cerrarCarga(){
    document.getElementById("pantalla-carga").style.display = "none";
}


function desplegarTodoMan(){
    const sectionListado = document.getElementById("section-listado");
    const sectionCategorias = document.getElementById("section-categorias");
    const tituloCategoria = document.getElementById("titulo-categoria");
    sectionListado.style.display = "flex";
    sectionCategorias.style.display = "none";
    tituloCategoria.style.display = "block";
}
function btnAtras(){
    document.getElementById("section-listado").style.display = "none";
    document.getElementById("section-categorias").style.display = "flex";
    document.getElementById("titulo-categoria").style.display = "none";
}

function desplegarMenu(){
    const asideMenu = document.getElementById("aside-menu");
    const aside = document.getElementById("aside");
    if(aside.style.display == "block"){
        aside.style.display = "none";
    }
    else{

        aside.style.display = "block";
    }
    asideMenu.style.animationName = "desplegar-menu";
}

function iniciarSesion(){
    const inputEmail = document.getElementById("input-email");
    const inputPassword = document.getElementById("input-password");
    if(inputEmail.value == "admin"){
        // history.go(-1);
        
        location.href = "@{/inventario.html}";
        document.getElementById("boton-inventario").style.display = "block";
    }
    else{
        alert("Usuario o contrasena incorrecto");
    }
}
function search(){
    alert("En el momento no disponemos de esta funcion");
}

function bajarMenuDamas(){
    const categoriaDamas = document.getElementById("cat-damas");
    categoriaDamas.style.animationName = "bajar";
    categoriaDamas.style.top = "50px";
    setTimeout(() => {
        categoriaDamas.style.zIndex = "1";
    }, 500);
    setTimeout(() => {
        subirMenuDamas();
    }, 5000);
}
function subirMenuDamas(){
    const categoriaDamas = document.getElementById("cat-damas");
    categoriaDamas.style.zIndex = "-1";
    setTimeout(() => {
        categoriaDamas.style.top = "-20px";
    }, 500);

}
function bajarMenuCaballeros(){
    const categoriaCaballeros = document.getElementById("cat-caballeros");
    categoriaCaballeros.style.animationName = "bajar";
    categoriaCaballeros.style.top = "50px";
    setTimeout(() => {
        categoriaCaballeros.style.zIndex = "1";
    }, 500);
    setTimeout(() => {
        subirMenuCaballeros();
    }, 5000);
}
function subirMenuCaballeros(){
    const categoriaCaballeros = document.getElementById("cat-caballeros");
    categoriaCaballeros.style.zIndex = "-1";
    setTimeout(() => {
        categoriaCaballeros.style.top = "-20px";
    }, 500);
}

