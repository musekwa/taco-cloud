package tacos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author musekwa
 *@SpringBootApplication: combines 3 annotations:
 *	1. @SpringBootConfiguration (a specialized form of @Configuration)
 *	2. @EnableAutoConfiguration (tells Spring Boot to automatically configure any required components)
 *	3. @ComponentScan (scans and registers components - @Component, @Controller, @Service, @Repository )
 */
@SpringBootApplication 
public class TacoCloudApplication {

	//When JAR file is executed, this method will be called
	public static void main(String[] args) {
		
		/**
		 * static method that bootstraps the application, and
		 * creates the Spring context
		 * Param1: the configuration class
		 * Param2: command-line arguments
		 */
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
