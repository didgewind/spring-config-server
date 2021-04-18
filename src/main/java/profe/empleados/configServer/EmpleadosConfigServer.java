package profe.empleados.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EmpleadosConfigServer {
    public static void main( String[] args ) {
		System.setProperty("spring.config.name", "empleados-config-server");
		SpringApplication.run(EmpleadosConfigServer.class, args);
    }
}
