package co.edu.eci;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan Pablo Arevalo
 */
@RestController
@RequestMapping("/")
public class BalanceController {
	String client1 = "http://localhost:35001/cadenas/actuales";
	String client2 = "http://localhost:35002/cadenas/actuales";
	String client3 = "http://localhost:35003/cadenas/actuales";
    
    @CrossOrigin(origins = "*")
    @RequestMapping(path = "balanceador", method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addCadena(@RequestBody Nombre cadena) {
    	String urlClient = "";
    	if(BalanceApplication.cliente == 1){
    		urlClient = client1;
    		BalanceApplication.cliente = 2;
    	}
    	else if(BalanceApplication.cliente == 2){
    		urlClient = client2;
    		BalanceApplication.cliente = 3;
    	}
    	else{
    		urlClient = client3;
    		BalanceApplication.cliente = 1;
    	}
    	System.out.println("SOLICITUD A: "+urlClient);
    	
        try {
        	JSONObject json = new JSONObject();
        	json.put("name", cadena.getName());    

        	CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        	try {
        	    HttpPost request = new HttpPost(urlClient);
        	    StringEntity params = new StringEntity(json.toString());
        	    request.addHeader("content-type", "application/json");
        	    request.setEntity(params);
        	    CloseableHttpResponse respuesta = httpClient.execute(request);
        	    HttpEntity entity = respuesta.getEntity();
        	    String responseString = EntityUtils.toString(entity, "UTF-8");	
        	    return new ResponseEntity<String>(responseString, HttpStatus.ACCEPTED);
        	} catch (Exception ex) {
                return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
        	} finally {
        	    httpClient.close();
        	}            
        } catch (Exception ex) {
            Logger.getLogger(BalanceController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<String>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
        }
    }
}

