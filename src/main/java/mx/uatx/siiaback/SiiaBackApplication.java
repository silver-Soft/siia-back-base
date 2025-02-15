package mx.uatx.siiaback;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@SpringBootApplication
public class SiiaBackApplication extends SpringBootServletInitializer{

    
	public static void main(String[] args) {
		
		SpringApplication.run(SiiaBackApplication.class, args);
	}
        
    
        
 /*   @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
            return application.sources(SiiaBackApplication.class);
        }*/






	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
			}
		};
	}

        
}

