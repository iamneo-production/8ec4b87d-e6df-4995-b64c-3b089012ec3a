

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class MedicalKnowledgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalKnowledgeApplication.class, args);
	}

}
