let lista = [];

function limpieza(){
    document.getElementById('amigo').value="";
}

function soloLetras(texto){
    //expresion solo letras acentos y espacio(\s) con el +$ uno o mas letras.
    // luego retorna la expresion con false o true.
    let expresion = /^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/;
    return expresion.test(texto);
}

function agregarAmigo(){
    let amigos = document.getElementById('amigo').value;    
    //console.log(amigos);
    //console.log(soloLetras(amigos));
    
    if(amigos==isNaN || amigos==null || amigos=="" || soloLetras(amigos)==false){
            alert('debes ingresar un nombre válido.');
            limpieza();
        }else{
            lista.push(amigos);

                for ( let i=0;i<lista.length;i++){
                    //Devuelvo los datos almacenados en una sola linea mas ordenado.
                    document.querySelector('#listaAmigos').innerHTML=lista.map(contenido =>`<button>${contenido}</button>`).join(" ");
                    
                    }
            limpieza();
        }
}

function sortearAmigo(){
    //condicion si hay amigos en la lista.
    if(lista.length!=0){
            //crear numero aleatorio para después buscarlo por el indice de la lista
            let numeroRandom = Math.floor(Math.random() * lista.length);
            
            //preparo variable con lista.
            let resultado = lista[numeroRandom];
            
            //envio variable al front.
            document.querySelector('#resultado').innerHTML=resultado
    }else{
            alert('no hay amigos en la lista')
    }
}