package edu.eci.aygo.persistence;

import edu.eci.aygo.model.entities.Cadena;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Juan Pablo Arévalo
 */
public interface CadenaRepository extends MongoRepository<Cadena, String>{

   public Cadena insert(Cadena cadena);
   
   public List<Cadena> findAll(Sort sort);
    
}
