package app.netlify.ruipina.server.repository;

import app.netlify.ruipina.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String IpAddress);
}
