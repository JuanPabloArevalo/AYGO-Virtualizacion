package edu.eci.aygo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import edu.eci.aygo.model.entities.Cadena;
import edu.eci.aygo.persistence.CadenaRepository;
import edu.eci.aygo.persistence.PersistenceException;
import java.util.List;

/**
 *
 * @author Juan Pablo Arévalo
 */
@Service
public class Services {

	@Autowired
    CadenaRepository cadenaRepository;
 
    
    public List<Cadena> addCadena(Cadena cadenaS) throws PersistenceException{
    	cadenaRepository.insert(cadenaS);
		List<Cadena> listCad = cadenaRepository.findAll(new Sort(Sort.Direction.DESC, "timeStamp"));
		int finish = 10;
		if(listCad.size()<=10){
			finish = listCad.size();
		}
		return listCad.subList(0, finish);
    	       
    }



    
}
