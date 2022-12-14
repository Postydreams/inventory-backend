package com.company.inventory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="category")
public class Category implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 53346491576034434L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	

}


// Clase categoria en el cual se define que sera un Entity, apunta a la tabla de nombre category, esta es serializable y se le genero un id el cual es generado automaticamente,
// ademas se definieron las variables id, name
// y description, ademas se utilizo lombok para evitar getter and setters, el lombok, al apuntar a la tabla category esta es llenada automaticamente con los getters y setters obtenidos,
// del Lombok.