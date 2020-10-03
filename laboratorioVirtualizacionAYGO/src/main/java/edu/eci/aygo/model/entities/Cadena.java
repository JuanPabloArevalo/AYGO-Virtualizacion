package edu.eci.aygo.model.entities;


import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Juan Pablo Arévalo
 */
@Document(collection = "cadenas")
public class Cadena {
	@Id
	private String id;
    private Date timeStamp;
    private String name;
    
    public Cadena(String name) {
        this.timeStamp = new Date(System.currentTimeMillis());
        this.id = new Date(System.currentTimeMillis()).toString();
        this.name = name;
    }

    public Cadena() {
        this.timeStamp = new Date(System.currentTimeMillis());
        this.id = new Date(System.currentTimeMillis()).toString();
    }

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
