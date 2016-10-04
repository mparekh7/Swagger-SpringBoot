package mansi.SwaggerDemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HiController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
    @RequestMapping("/hi")
    public String hello() {
        return "Hiii Mansi";
    }

}