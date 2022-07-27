package hm_deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${app.message}")
	String message;
    @GetMapping
    public String hola(){
    	System.out.println(message);
        return "Bienvenido a tu deploy de Spring en Heroku XD!";
    }
}
