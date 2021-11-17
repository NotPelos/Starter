package starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(saludo.class)
@EnableConfigurationProperties(saludoProperties.class)
public class saludoAutoconfigure {

	private final saludoProperties properties;
	
	public saludoAutoconfigure(saludoProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public saludo saludo() {
		System.out.println("Idioma: "+properties.getIdioma());
		return new saludo(properties.getIdioma());
	}
}