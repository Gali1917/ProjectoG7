
function desplegarTodoInicio(){
    const sectionListado = document.getElementById("section-listado");
    let precio = 0;
    let url = "";
    let newContent = `
    <div id="nueva-card" class="col-4 col-xl-3 mb-5">
        <div class="card-categoria sombreado">
            <div class="btn-categoria">
                <button class="btn-card sombreado">$${precio}</button>
            </div>
            <div class="img-cards sombreado">
                <img src=${url} alt="Producto">
            </div>
        </div>
    </div>`;
    sectionListado.innerHTML += newContent;
}


function desplegarTodoCaballeros(){
    const sectionListado = document.getElementById("section-listado");
    let precio = 0;
    let url = "";
    let newContent = `
    <div id="nueva-card" class="col-4 col-xl-3 mb-5">
        <div class="card-categoria sombreado">
            <div class="btn-categoria">
                <button class="btn-card sombreado">$${precio}</button>
            </div>
            <div class="img-cards sombreado">
                <img src=${url} alt="Producto">
            </div>
        </div>
    </div>`;
    sectionListado.innerHTML += newContent;
}


function desplegarTodoDamas(){
    const sectionListado = document.getElementById("section-listado");
    let precio = 0;
    let url = "";
    let newContent = `
    <div id="nueva-card" class="col-4 col-xl-3 mb-5">
        <div class="card-categoria sombreado">
            <div class="btn-categoria">
                <button class="btn-card sombreado">$${precio}</button>
            </div>
            <div class="img-cards sombreado">
                <img src=${url} alt="Producto">
            </div>
        </div>
    </div>`;
    sectionListado.innerHTML += newContent;
}

function listarPrendasSuperioresDamas(){
    const prendasSuperioresDamas = document.getElementById("prendas-superiores-damas");
    prendasSuperioresDamas.className = "titulo-activo";
    document.getElementById("todo-damas").className = "titulo-inactivo";
    document.getElementById("prendas-inferiores-damas").className = "titulo-inactivo";
    document.getElementById("conjuntos-damas").className = "titulo-inactivo";
}
function listarPrendasInferioresDamas(){
    const prendasInferioresDamas = document.getElementById("prendas-inferiores-damas");
    prendasInferioresDamas.className = "titulo-activo";
    document.getElementById("todo-damas").className = "titulo-inactivo";
    document.getElementById("prendas-superiores-damas").className = "titulo-inactivo";
    document.getElementById("conjuntos-damas").className = "titulo-inactivo";
}
function listarConjuntosDamas(){
    const conjuntosDamas = document.getElementById("conjuntos-damas");
    conjuntosDamas.className = "titulo-activo";
    document.getElementById("todo-damas").className = "titulo-inactivo";
    document.getElementById("prendas-inferiores-damas").className = "titulo-inactivo";
    document.getElementById("prendas-superiores-damas").className = "titulo-inactivo";
}
function todoDamas(){
    const todoDamas = document.getElementById("todo-damas");
    todoDamas.className = "titulo-activo";
    document.getElementById("prendas-superiores-damas").className = "titulo-inactivo";
    document.getElementById("prendas-inferiores-damas").className = "titulo-inactivo";
    document.getElementById("conjuntos-damas").className = "titulo-inactivo";
}

function listarPrendasSuperioresCaballeros(){
    const prendasSuperioresCaballeros = document.getElementById("prendas-superiores-caballeros");
    prendasSuperioresCaballeros.className = "titulo-activo";
    document.getElementById("todo-caballeros").className = "titulo-inactivo";
    document.getElementById("prendas-inferiores-caballeros").className = "titulo-inactivo";
    document.getElementById("conjuntos-caballeros").className = "titulo-inactivo";
}
function listarPrendasInferioresCaballeros(){
    const prendasInferioresCaballeros = document.getElementById("prendas-inferiores-caballeros");
    prendasInferioresCaballeros.className = "titulo-activo";
    document.getElementById("todo-caballeros").className = "titulo-inactivo";
    document.getElementById("prendas-superiores-caballeros").className = "titulo-inactivo";
    document.getElementById("conjuntos-caballeros").className = "titulo-inactivo";
}
function listarConjuntosCaballeros(){
    const conjuntosCaballeros = document.getElementById("conjuntos-caballeros");
    conjuntosCaballeros.className = "titulo-activo";
    document.getElementById("todo-caballeros").className = "titulo-inactivo";
    document.getElementById("prendas-inferiores-caballeros").className = "titulo-inactivo";
    document.getElementById("prendas-superiores-caballeros").className = "titulo-inactivo";
}
function todoCaballeros(){
    const todoCaballeros = document.getElementById("todo-caballeros");
    todoCaballeros.className = "titulo-activo";
    document.getElementById("prendas-superiores-caballeros").className = "titulo-inactivo";
    document.getElementById("prendas-inferiores-caballeros").className = "titulo-inactivo";
    document.getElementById("conjuntos-caballeros").className = "titulo-inactivo";
}