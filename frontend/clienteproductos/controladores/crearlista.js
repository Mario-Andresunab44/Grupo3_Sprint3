const API= "http://localhost:8080/Lista"
const CREARLISTA_POST_ENPOINT= API+ "/lista"

const crear= async(lista)=>{

    try{

        const respuesta= await fetch(REARLISTA_POST_ENPOINT,
            {method: "POST",
            headers: {"Content-Type":"application/json"},
            body: JSON.stringify(lista)})
        
        return await respuesta.json()

    }catch(error){
        console.log("Error fetch", error)
    }
}

function crearlista(){
    
}