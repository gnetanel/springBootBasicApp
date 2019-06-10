package hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(PersonRepository repository) {
		return (args) -> {
			// save a couple of customers
			Person p = new Person();
			p.setFirstName("a");
			p.setLastName("1");
			repository.save(p);
			
		};
	}
		
}