package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;
import java.util.Scanner; // para usar scanner

@Component

public class Ejercicios {
	
	private int numero;
	
	public Ejercicios() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

	// EJERCICIOS
	
	//PUNTO 01
	
	public int factorial() {
		int factorial=1;
		
		while(numero!=0) {
			factorial*=numero;
			numero--;
		}
		
		return factorial;
	}
	
	//PUNTO 02
	
	public boolean bisiesto() {
		boolean esbisiesto=true;
		
		if(numero%4 != 0 || (numero%100 == 0 && numero%400 != 0)) {
			esbisiesto=false;
		}
		
		return esbisiesto;
	}
	
	//PUNTO 03
	
	public String par() {
		String resultado=" no es par";
		
		if (numero%2==0) {
			resultado=" es par";
		}
		return resultado;
	}
	
	//PUNTO 04
	
	public String mes() {
		String esmes="el numero ingresado no corresponde a un mes";
		
		if(numero>0 && numero<13) {
			esmes="el numero ingresado corresponde a un mes del anio";
		}
		
		return esmes;
	}
	
	//PUNTO 05
	
		public String mes2() {
			String mes2;
			switch(numero) {
			case 1:
				mes2="Enero";
				break;
			case 2:
				mes2="Febrero";
				break;
			case 3:
				mes2="Marzo";
				break;
			case 4:
				mes2="Abril";
				break;
			case 5:
				mes2="Mayo";
				break;
			case 6:
				mes2="Junio";
				break;
			case 7:
				mes2="Julio";
				break;
			case 8:
				mes2="Agosto";
				break;
			case 9:
				mes2="Septiembre";
				break;
			case 10:
				mes2="Octubre";
				break;
			case 11:
				mes2="Noviembre";
				break;
			case 12:
				mes2="Diciembre";
				break;
			
			default:
				mes2="El numero ingresado no corresponde con ningun mes";
				break;
			}
			
			return mes2;
		}

}
