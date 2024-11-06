package proyecto2.co.tarjeta_credito.Repositorio;


import proyecto1.co.tarjeta_credito.Entidad.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}
