package com.tres.tutorial3_coche;

public class Furgoneta extends Coche{
private int capCarga,  plazasExtra,pesoConCarga;
//private String nombre;

//Metodos Constructores
public Furgoneta(int plazasExtra,int capCarga) {
	super();
	this.setCapCarga(capCarga);
	this.setPlazasExtra(plazasExtra);
}
public Furgoneta() {
	this(2,1500);
}
public Furgoneta(String a) {
	super();
}


//Metodos Setters
public void setCapCarga(int capCarga) {
	this.capCarga = capCarga;
}

/**
 * @param plazasExtra the plazasExtra to set
 */
public void setPlazasExtra(int plazasExtra) {
	this.plazasExtra = plazasExtra;
}


//Metodos Geters
public int getCapCarga() {
	return capCarga;
}
/**
 * @return the plazasExtra
 */
public int getPlazasExtra() {
	return plazasExtra;
}

//Metodos extra
public int pesoConCarga() {
	pesoConCarga=capCarga+this.damePesoPlataforma();
	return pesoConCarga;
}


}