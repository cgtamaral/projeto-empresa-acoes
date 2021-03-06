package self.manobray.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class EmailProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailProcessorApplication.class, args);
	}
}
