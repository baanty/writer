/**
 * 
 */
package runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import configuration.ApplicationConfig;

/**
 * @author WE43MM
 * 
 * This is the runner class for the
 * Spring Boot application
 *
 */

//@EnableWebMvc
@SpringBootApplication
public class WriterRunner {
    
    @Autowired
    ApplicationConfig applicationConfig;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(WriterRunner.class, args);
		String[] x = {};
	}
}
