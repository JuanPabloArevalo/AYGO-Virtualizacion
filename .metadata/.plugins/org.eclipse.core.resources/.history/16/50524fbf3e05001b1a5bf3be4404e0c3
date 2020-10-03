var apiclientCadena = (function(){
    var equipoBackEnd = "http://localhost:8080"
    return{
    	addCadenas(cadena){
            return $.ajax({
                url:  equipoBackEnd+"/balanceador",
                type: "POST",
                data: '{"name":"'+cadena+'"}',
                contentType: "application/json"});
        }
    };
    
}());
