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

	@GetMapping("/ejercicio03")

	public String getEjercicio03Page(@RequestParam (name = "n1") int n1, Model model) {

		Ejercicios ejercicioTres = new Ejercicios();
		
		ejercicioTres.setNumero(n1);
		
		
		model.addAttribute("ejercicio03", ejercicioTres.par());
		
		return "ejercicio03";
		
	}

	
	
	// EJERCICIO 04
	
	@GetMapping("/ejercicio04")
	
	public String getEjercicio04Page(@RequestParam(name="n1") int n1, Model model) {
		Ejercicios ejercicioCuatro = new Ejercicios();
		
		ejercicioCuatro.setNumero(n1);
		
		model.addAttribute("ejercicio04", ejercicioCuatro.mes());
		return "ejercicio04";
		
	}
	
	
	
	// EJERCICIO 05
	
	@GetMapping("/ejercicio05")
	
	public String getEjercicio05Page(@RequestParam(name="n1") int n1, Model model) {
		Ejercicios ejercicioCinco = new Ejercicios();
		
		ejercicioCinco.setNumero(n1);
		
		model.addAttribute("ejercicio05",ejercicioCinco.mes2());
		
		return "ejercicio05";
	}
	
	
	
	// EJERCICIO 6
	
	@GetMapping("/ejercicio06")
	
	public String getEjercicio06Page(@RequestParam(name="n1") int n1, Model model) {
		Ejercicios ejercicioSeis = new Ejercicios();
		
		ejercicioSeis.setNumero(n1);
		
		model.addAttribute("ejercicio06",ejercicioSeis.evaluarCondicion());
		
		return "ejercicio06";
	}
	
	
	
	// EJERCICIO 8
	
	@GetMapping("/ejercicio08")
	
	public String getEjercicio08Page(@RequestParam(name="n1") int n1, Model model) {
		Ejercicios ejercicioOcho = new Ejercicios();
		
		ejercicioOcho.setNumero(n1);
		
		model.addAttribute("ejercicio08",ejercicioOcho.secuencia());
		
		return "ejercicio08";
	}
	
	
	// EJERCICIO 9
	
	@GetMapping("/ejercicio09")
	
	public String getEjercicio09Page(Model model) {
		Ejercicios ejercicioNueve = new Ejercicios();
		
		model.addAttribute("ejercicio09", ejercicioNueve.mostrarNumerosFor());
		
		return "ejercicio09";
	}
	
	
	// EJERCICIO 10
	
	@GetMapping("/ejercicio10")
	
	public String getEjercicio10Page(Model model) {
		Ejercicios ejercicioDiez = new Ejercicios();
		
		model.addAttribute("ejercicio10", ejercicioDiez.mostrarNumerosWhile());
		
		return "ejercicio10";
	}
	
	// EJERCICIO 11
	
	@GetMapping("/ejercicio11")
	
	public String getEjercicio11Page(Model model) {
		Ejercicios ejercicioOnce = new Ejercicios();
		
		model.addAttribute("ejercicio11", ejercicioOnce.mostrarNumerosDoWhile());
		
		return "ejercicio11";
	}
	
	// EJERCICIO 12
	
	@GetMapping("/ejercicio12")
	
	public String getEjercicio12Page(@RequestParam(name="n1") int n1, Model model) {
		Ejercicios ejercicioDoce = new Ejercicios();
		
		ejercicioDoce.setNumero(n1);
		
		model.addAttribute("ejercicio12",ejercicioDoce.calculoTiempo());
		
		return "ejercicio12";
	}
	
}
