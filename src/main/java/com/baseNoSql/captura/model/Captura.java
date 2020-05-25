package com.baseNoSql.captura.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "capturas")
	public class Captura{
	  @Id
	  private String id;

	  private String marca;
	  private String nombre_fantasia;
	  private String denominacion;
	  private String rnpa;
	  
	  
	  
	public Captura() {
		
	}


	public Captura(String marca, String nombre_fantasia, String denominacion, String rnpa) {		
		this.marca = marca;
		this.nombre_fantasia = nombre_fantasia;
		this.denominacion = denominacion;
		this.rnpa = rnpa;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getNombre_fantasia() {
		return nombre_fantasia;
	}


	public void setNombre_fantasia(String nombre_fantasia) {
		this.nombre_fantasia = nombre_fantasia;
	}


	public String getDenominacion() {
		return denominacion;
	}


	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}


	public String getrnpa() {
		return rnpa;
	}


	public void setrnpa(String rnpa) {
		this.rnpa = rnpa;
	}


	@Override
	public String toString() {
		return "Captura [id=" + id + ", marca=" + marca + ", nombre_fantasia=" + nombre_fantasia + ", denominacion="
				+ denominacion + ", rnpa=" + rnpa + "]";
	}


		 	
	}

