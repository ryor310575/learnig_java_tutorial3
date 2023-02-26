package com.tres.tutorial3_coche;
//Uso de timos ennumerados usando la clase UsoTallasENUN
public enum UsoTallasENUN { 
	mini("s"), mediano("m"), grande("l"), enorme("xl");
	private UsoTallasENUN(String abreviatura) {
		this.abreviatura=abreviatura;
	}
	private String abreviatura;
	public String dameAbreviatura() {
		return abreviatura;
	}
}
