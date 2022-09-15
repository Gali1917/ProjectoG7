
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