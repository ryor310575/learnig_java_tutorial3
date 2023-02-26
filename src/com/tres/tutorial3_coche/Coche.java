package com.tres.tutorial3_coche;

public class Coche {
	//Caracteristicas comunes
	private int ruedas,largo, ancho,motor,pesoPlataforma;
	
	
	//Caracteristicas especiales
	private int pesoTotal;
	private int pesoCarroceria=500;
	private String color, nombre;
	private boolean asientosCuero, climatizador;
	
	//Metodos Constructores
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
		color="Azul";
		nombre = "Vehiculo Standard";
	}
	public Coche(String nombreSet) {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
		color="Azul";
		nombre = nombreSet;
	}

	/*
	 * Metodos Setter
	 */
	public void estableceNombre(String nombreSet) {//Setter
		nombre=nombreSet;
	}
	public void establecePesoCarroceria(int pesoCarroceria) {//Setter
		this.pesoCarroceria=pesoCarroceria;
	}
	public void estableceColor(String a) {//Setter
		color=a;
	}
	public void configuraAsientos(String asientosCuero) {//Setter
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero=true;
		}else {
			this.asientosCuero=false;
		}
	}
	public void configuraClimatizador(String climatizador) {//Setter
		if (climatizador.equalsIgnoreCase("si")) {//Setter
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	
	/*
	 * Metodos getter
	 */
	public String dimeAsientos() {//getter
		if (asientosCuero) {
			return "Tiene asientos de cuero";
		}else {
			return "Tiene asientos de  serie";
		}
	}
	public String dimeClimatizador() {//getter
		if (climatizador==true) {
			return "Tiene Aire Acondicionado";
		}else {
			return "No tiene Climatizador";
		}
	}
	public String  dimeDatoGenerales() {//getter
		return "El vehiculo tiene "+ruedas+" Ruedas, \nmide "+largo/1000+" metros de largo "
	+ancho+" CM de ancho, \nun motor de "+motor+"CC  \ny un peso de plataforma de "+pesoPlataforma+" kg";
	}
	public int  dameLargo() {//getter
		return largo;
	}
	public int  dameRuedas() {//getter
		return ruedas;
	}	
	public int  dameAncho() {//getter
		return ancho;
	}	
	public int  dameMotor() {//getter
		return motor;
	}	
	public int  damePesoPlataforma() {//getter
		return pesoPlataforma;
	}
	public int  damePesoCarroceria() {//getter
		return pesoCarroceria;
	}	
	public String  dameColor() {//getter
		return color;
	}
	public String  dameNombre() {//getter
		return nombre;
	}
	public boolean dameAsientosCuero() {//getter
		return asientosCuero;
	}
	
	/*
	 * Metodos Extras
	 */
	public int precioCoche() {
		int precio_total=10000;
		if(asientosCuero) {
			precio_total+=1000;
		}
		if(climatizador) {
			precio_total+=1500;
		}
		return precio_total;
	}
	
	public String dimePesoCoche() {
		pesoTotal=pesoPlataforma+pesoCarroceria;
		if(asientosCuero) {
			pesoTotal+=30;
		}
		if(climatizador) {
			pesoTotal+=50;
		}
		
		return "El peso del coche es: " + pesoTotal;
	}
	
	
	
}