import React from "react";
import { useState, useEffect } from "react";
import { useParams } from "react-router-dom";
const Hour = ()=>{
    let { userName } = useParams();
    let name = { userName}["userName"];
    const [dato, setDato] = useState(null);
    let userURL = "http://localhost:8087/"+name+"/hour";
    console.log(userURL);
    useEffect(
        ()=>{
            fetch(userURL)
            .then(respuesta => respuesta.json())
            .then((dato) => {setDato(dato.dato); console.log(dato.dato) } );
        },
        []
    );
    return(
        <section>
            <h3> {dato}!</h3>
        </section>
    )
}
export default Hour