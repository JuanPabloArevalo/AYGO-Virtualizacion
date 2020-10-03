package edu.eci.aygo.restcontrollers;

import edu.eci.aygo.model.entities.Cadena;
import edu.eci.aygo.persistence.PersistenceException;
import edu.eci.aygo.services.Services;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/cadenas")
public class CadenaResourceController {

    @Autowired
    Services services;
    
    @CrossOrigin(origins = "*")
    @RequestMapping(path = "/actuales", method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addCadena(@RequestBody Cadena cadena) {
        try {
            return new ResponseEntity<>(services.addCadena(cadena), HttpStatus.ACCEPTED);
        } catch (PersistenceException ex) {
            Logger.getLogger(CadenaResourceController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
