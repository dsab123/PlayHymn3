package app;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {

//	@Bean
//	@Profile("test")
//	public EmbeddedServletContainerFactory servletContainer() {
//		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
//		tomcat.addAdditionalTomcatConnectors(createHTTPConnector());
//		return tomcat;
//	}
//
//	@Profile("test")
//	private Connector createHTTPConnector() {
//		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//		connector.setScheme("http");
//		//connector.setPort(Integer.parseInt(System.getenv("PORT")));
//		connector.setPort(8080);
//		return connector;
//	}
	
	@Autowired
	private HymnRepository hymnRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
