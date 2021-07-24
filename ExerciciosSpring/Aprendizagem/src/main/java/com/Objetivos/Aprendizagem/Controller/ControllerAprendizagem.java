package com.Objetivos.Aprendizagem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aprendizagem")

public class ControllerAprendizagem {

	@GetMapping
	public String Aprendizagem () {
		return "Meus objetivos de aprendizagem para a semana são incremento de agilidade, raciocinio lógico perante as dificuldades nas tarefas. Também gostaria de entender mais um pouco do por que funciona/ por que não funciona.";
}
}
