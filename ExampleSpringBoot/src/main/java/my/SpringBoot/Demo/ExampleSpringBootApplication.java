package my.SpringBoot.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class ExampleSpringBootApplication {

	@RequestMapping("/")
	@ResponseBody
	String home()
	{
		return "Hello there, this is home page";
	}
	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringBootApplication.class, args);
	}
}
