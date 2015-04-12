package app;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

//	@Bean
//	public EmbeddedServletContainerFactory servletContainer() {
//		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
//		tomcat.addAdditionalTomcatConnectors(createHTTPConnector());
//		return tomcat;
//	}
//
//	private Connector createHTTPConnector() {
//		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//		connector.setScheme("http");
//		//connector.setPort(Integer.parseInt(System.getenv("PORT")));
//		//connector.setPort(9000);
//		return connector;
//	}
	
	@Autowired
	private HymnRepository hymnRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
