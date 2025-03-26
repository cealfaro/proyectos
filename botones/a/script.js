let contadorId = 0; // Inicializa el contador de IDs
const botones = []; // Arreglo para almacenar los botones

function crearBoton() {
  const boton = document.createElement("button");
  const idBoton = `boton-${contadorId}`; // Genera un ID único
  boton.id = idBoton;
  boton.textContent = `Botón ${contadorId}`;

  // Agrega un evento onclick para eliminar el botón
  boton.onclick = function() {
    eliminarBoton(idBoton);
  };

  botones.push(boton); // Agrega el botón al arreglo
  document.getElementById("contenedor-botones").appendChild(boton);

  contadorId++; // Incrementa el contador de IDs
}

function eliminarBoton(idBoton) {
  const boton = document.getElementById(idBoton);
  if (boton) {
    boton.remove(); // Elimina el botón del DOM

    // Elimina el botón del arreglo
    const indice = botones.findIndex(b => b.id === idBoton);
    if (indice !== -1) {
      botones.splice(indice, 1);
    }
  }
}