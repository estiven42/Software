package proyecto1.co.tarjeta_credito.Repositorio;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proyecto1.co.tarjeta_credito.Entidad.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepo extends CrudRepository<Cliente, Integer> {
    List<Cliente> findByCorreo(String correo);
    Optional<Cliente> findByCorreoAndContrasena(String correo, String contrasena);
}

