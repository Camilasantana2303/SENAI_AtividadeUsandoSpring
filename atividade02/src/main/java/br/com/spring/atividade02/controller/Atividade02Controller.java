package br.com.spring.atividade02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividade02Controller {

	@GetMapping("/adicao")
	public String adicao(@RequestParam int num1,@RequestParam int num2) {
		int result;
		result =num1+num2;
		return "Resultado: "+result;
	}
	
	@GetMapping("/subtracao")
	public String subtracao(@RequestParam int num1,@RequestParam int num2) {
		int result;
		result =num1-num2;
		return "Resultado: "+result;
	}
	
	@GetMapping("/multiplicacao")
	public String multiplicacao(@RequestParam int num1,@RequestParam int num2) {
		int result;
		result =num1*num2;
		return "Resultado: "+result;
	}
	
	@GetMapping("/divisao")
	public String aluno(@RequestParam int num1,@RequestParam int num2) {
		int result;
		result =num1/num2;
		return "Resultado: "+result;
	}
	
	
	
}
