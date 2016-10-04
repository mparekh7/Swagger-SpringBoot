package mansi.SwaggerDemo.main;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = { "mansi.SwaggerDemo" })
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication.run(App.class, args);
	}

	// @Component
	// public class CustomizationBean implements
	// EmbeddedServletContainerCustomizer {
	//
	// @Override
	// public void customize(ConfigurableEmbeddedServletContainer arg0) {
	// System.out.println("Changing default port from 8080 to 8083 here.");
	// arg0.setPort(8083);
	// arg0.setContextPath("/context");
	// }
	// }
}
