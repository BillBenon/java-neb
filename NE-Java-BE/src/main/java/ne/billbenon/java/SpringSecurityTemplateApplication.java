package ne.billbenon.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan
public class SpringSecurityTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTemplateApplication.class, args);
	}

}
