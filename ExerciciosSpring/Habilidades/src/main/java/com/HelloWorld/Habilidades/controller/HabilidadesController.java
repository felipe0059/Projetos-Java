package com.HelloWorld.Habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Habilidades")

public class HabilidadesController {
	@GetMapping
	public String Habilidades () {
	return "Persistência foi a mentalidade utilizada pois foram 16 tentativas fracassadas para fazer funcionar. A habilidade escolhida é orientação aos detalhes pois por algum detalhe eu perdi 01 dia .";
}
}
