package com.tres.tutorial3_coche;
import javax.swing.*;
public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche Renault=new Coche("Renault Logan"); //instance of Coche
		Furgoneta Mack=new Furgoneta("Dina 7500");
		String outMessageString="";
		/*
		 * Setting del Coche
		 */
		JOptionPane.showMessageDialog(null, "Setting del Coche");
		Renault.estableceColor(JOptionPane.showInputDialog("¿Cual Es el Color?"));
		//System.out.println("El Coche tiene Color " + Renault.dameColor());
		Renault.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		Renault.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene Climatizador?"));	
		outMessageString=
				"\n Nombre: " + Renault.dameNombre() +
				"\n"+ Renault.dimeDatoGenerales()+
				"\n Es de color: "+ Renault.dameColor()+
				"\n Asientos: "+Renault.dimeAsientos()+
				"\n "+ Renault.dimeClimatizador();
		JOptionPane.showMessageDialog(null, outMessageString);		
		System.out.println(outMessageString);
		
		/*
		 * Setting de la Furgoneta
		 */
		JOptionPane.showMessageDialog(null, "Setting de la Furgoneta");
		Mack.estableceColor(JOptionPane.showInputDialog("¿Cual Es el Color?"));
		//System.out.println("El Coche tiene Color " + Renault.dameColor());
		Mack.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		Mack.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene Climatizador?"));
		outMessageString="\n Nombre: " + Mack.dameNombre()+
				"\n" + Mack.dimeDatoGenerales()+
				"\n Es de color: "+ Mack.dameColor()+
				"\n Asientos: "+Mack.dimeAsientos()+
				"\n "+Mack.dimeClimatizador()+
				"\n Plazas Extra "+Mack.getPlazasExtra()+
				"\n Capacidad de Carga "+Mack.getCapCarga()+
				"\n Peso con carga "+ Mack.pesoConCarga();
		
		JOptionPane.showMessageDialog(null, outMessageString);		
		System.out.println(outMessageString);
		System.out.println(Renault.dimePesoCoche());		
	}
		
}