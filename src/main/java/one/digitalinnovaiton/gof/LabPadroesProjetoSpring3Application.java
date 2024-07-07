package one.digitalinnovaiton.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpring3Application {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpring3Application.class, args);
	}

}
