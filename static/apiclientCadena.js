var apiclientCadena = (function(){
    var equipoBackEnd = "http://localhost:8000"
    return{
    	addCadenas(cadena){
            return $.ajax({
                url:  equipoBackEnd+"/cadenas/actuales",
                type: "POST",
                data: '{"name":"'+cadena+'"}',
                contentType: "application/json"});
        }
    };
    
}());
