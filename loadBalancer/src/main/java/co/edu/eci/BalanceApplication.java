package co.edu.eci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "co.edu.eci")
public class BalanceApplication {
	
	public static int cliente = 1;

	public static void main(String[] args) {
		SpringApplication.run(BalanceApplication.class, args);
	}
}
