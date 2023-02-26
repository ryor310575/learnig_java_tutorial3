package com.tres.tutorial3_coche;

import java.util.Scanner;
//Uso de timos ennumerados usando la clase UsoTallasENUN
public class UsoTallas {

	public UsoTallas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String entradaTalla;
		System.out.println("Escribe una talla: mini, mediano, grande, enorme");
		entradaTalla = entrada.next().toLowerCase();
		UsoTallasENUN laTalla= Enum.valueOf(UsoTallasENUN.class, entradaTalla);
		System.out.println("Talla "+entradaTalla);
		System.out.println("Abreviatura "+laTalla.dameAbreviatura());
		entrada.close();
	}

}
