import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {


	@Value( "${app.env}" )
	private String env;
	
	@RequestMapping("/")
	String home() {
		return "Hello World (env=" + env + ")";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}