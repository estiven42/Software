package proyecto2.co.tarjeta_credito.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto1.co.tarjeta_credito.Entidad.Cliente;

public interface ClienteRepo extends JpaRepository<Cliente, Long> {}
