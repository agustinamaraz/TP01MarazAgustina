package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Ejercicios;

import java.util.Scanner;

@Controller
public class EjerciciosController {
	
	@GetMapping("/menu")

	public String mostrarMenuEjercicios() {

		return ("index");
	}
	
	
	// EJERCICIO 01
	
	@GetMapping("/ejercicio01")
	
	public String getEjercicio01Page(@RequestParam(name="n1") int n1, Model model) {
		Ejercicios ejercicioUno = new Ejercicios();
		
		ejercicioUno.setNumero(n1);
		
		model.addAttribute("ejercicio01", ejercicioUno.factorial());
		
		return "ejercicio01";
		
	}
	
	
	
	// EJERCICIO 02
	
	@GetMapping("/ejercicio02")
	
	public String getEjercicio02Page(@RequestParam(name="n1") int n1, Model model) {
		Ejercicios ejercicioDos = new Ejercicios();
		
		ejercicioDos.setNumero(n1);
		
		boolean esbisiesto = ejercicioDos.bisiesto();
		String verdadero="si";
		
		if(esbisiesto==false) {
			verdadero="no";
		}
		
		model.addAttribute("ejercicio02", verdadero);
		
		return "ejercicio02";
		
	}
	
	
	
	//EJERCICIO 03

	/*@GetMapping("/ejercicio03")

	public String getEjercicio03Page(@RequestParam (name = "n1") int n1, Model model) {

		Ejercicios ejercicioTres = new Ejercicios();
		
		String array[] = new String[5];
		
		for(int i=0; i<array.length; i++) {
			ejercicioTres.setNumero(i);
			array[i] = ejercicioTres.par();
			
			n1=n1+5;
			
			model.addAttribute("array[i]", array[0]);
			model.addAttribute("array[i]", array[1]);
			model.addAttribute("array[i]", array[2]);
			model.addAttribute("array[i]", array[3]);
			model.addAttribute("array[i]", array[4]);
		}
		
		
		
		return "ejercicio3";
		
	}*/

	
	
	// EJERCICIO 04
	
	@GetMapping("/ejercicio04")
	
	public String getEjercicio04Page(@RequestParam(name="n1") int n1, Model model) {
		Ejercicios ejercicioCuatro = new Ejercicios();
		
		ejercicioCuatro.setNumero(n1);
		
		model.addAttribute("ejercicio04", ejercicioCuatro.mes());
		return "ejercicio04";
		
	}
	
	
	
	@GetMapping("/ejercicio05")
	
	public String getEjercicio05Page(@RequestParam(name="n1") int n1, Model model) {
		Ejercicios ejercicioCinco = new Ejercicios();
		
		ejercicioCinco.setNumero(n1);
		
		model.addAttribute("ejercicio05",ejercicioCinco.mes2());
		
		return "ejercicio05";
	}
	
}
