package app.netlify.ruipina.server;

import app.netlify.ruipina.server.enumeration.Status;
import app.netlify.ruipina.server.model.Server;
import app.netlify.ruipina.server.repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static app.netlify.ruipina.server.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

/*  @Bean
	CommandLineRunner run(ServerRepository serverRepository) {
		return args -> {
			serverRepository.save(new Server(null, "192.168.1.168", "Ubuntu Linux", "16 GB", "Personal Computer",
					"http://localhost:8080/server/image/server1.png", SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.58", "Kali Linux", "8 GB", "HP Tower",
					"http://localhost:8080/server/image/server2.png", SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.21", "Windows 11", "32 GB", "Web Server",
					"http://localhost:8080/server/image/server3.png", SERVER_UP));
			serverRepository.save(new Server(null, "192.168.1.14", "MS 2008", "64 GB", "Mail Server",
					"http://localhost:8080/server/image/server4.png", SERVER_UP));
		};
	}*/
}
