package com.tres.tutorial5_persona;
//Clase abtracta, base para las demas clases
public abstract class Persona {
	private final String nombre;
	public Persona(String nom) {
		nombre=nom;
	}
	public String dameNombre() {//getter
		return nombre;
	}
	public abstract String dameDescripcion(); 

}
