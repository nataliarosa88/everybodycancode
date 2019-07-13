package br.com.todospodemprogramar.app;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import br.com.todospodemprogramar.TodospodemprogramarApplication;
/**
 * Created by Natalia Rosa on 08/07/19.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TodospodemprogramarApplication.class);
	}

}
