package proyecto1.co.tarjeta_credito.Repositorio;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import proyecto1.co.tarjeta_credito.Entidad.Cliente;

import java.util.List;

@Repository
public interface ClienteRepo extends CrudRepository<Cliente, Integer> {
    List<Cliente> findByCorreo(String correo);
    // Métodos adicionales según sea necesario
}
