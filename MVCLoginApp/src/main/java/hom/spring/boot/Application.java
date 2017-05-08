package hom.spring.boot;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import hom.controller.prctc.GreetingController;

@SpringBootApplication
//@ComponentScan("hom.controller.prctc")
@EnableAutoConfiguration
@ComponentScan
public class Application {

	public static void main(String[] args) {
		
		int port = (int) (Math.random()*10000);
		System.out.println("URL => " + "\n"+"http://localhost:"+port+"/");
		HashMap<String, Object> props = new HashMap<String, Object>();
		props.put("server.port", port);
		
		Object[] sources = new Object[2];
        sources[0] = Application.class;
        sources[1] = GreetingController.class;

		try {
			new SpringApplicationBuilder()
			    .sources(sources)                
			    .properties(props)
			    .run(args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
       // SpringApplication.run(Application.class, args);
    }
	
}
