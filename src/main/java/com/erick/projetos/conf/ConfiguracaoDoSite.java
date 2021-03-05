package com.erick.projetos.conf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfiguracaoDoSite {

	@GetMapping(path = "/")
	public String index() {
		return "index";
	}
	
}
