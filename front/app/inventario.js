function damas(){
    const menuAsideDama = document.getElementById("menu-aside-dama");
    if(menuAsideDama.style.display == "flex"){
        menuAsideDama.style.display = "none";
    }
    else{
        menuAsideDama.style.display = "flex";
    }
}
function caballeros(){
    const menuAsideCaballero = document.getElementById("menu-aside-caballero");
    if(menuAsideCaballero.style.display == "flex"){
        menuAsideCaballero.style.display = "none";
    }
    else{
        menuAsideCaballero.style.display = "flex";
    }
}