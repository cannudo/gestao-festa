package com.algaworks.festa;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		Class<?> classeDaAplicacao = GestaoFestaApplication.class;
		
		/* :raised_hand: Pra quê essa perfumaria toda, Cannudo?
		 *
		 * :nerd_face: Para que a aplicação rode independente do contexto e do ambiente.
		 * :light_bulb: Repare no retorno da função.
		 */
		
		return application.sources(classeDaAplicacao);
	}

}
