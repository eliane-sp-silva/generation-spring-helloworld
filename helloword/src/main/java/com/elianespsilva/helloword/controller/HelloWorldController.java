package com.elianespsilva.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //comandos do crud será feito aqui , essa classe será responsavel pelos metodos de acesso
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping //essa anotação avisa que é um método de busca de info.
	public String helloWorld()
	{
	return "Hello World";	
	}

	
	
	
	
}
