package proyecto2.co.tarjeta_credito.Implementacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto1.co.tarjeta_credito.Entidad.Cliente;
import proyecto2.co.tarjeta_credito.Repositorio.ClienteRepo;
import proyecto2.co.tarjeta_credito.Servicios.ClienteServicios;

import java.util.Optional;

@Service
public class ClientesIMPL implements ClienteServicios {

    @Autowired
    private ClienteRepo clienteRepo;

    @Override
    public Cliente validarCliente(String nombreCorreo, String contrasena) {
        Optional<Cliente> clienteOpt = clienteRepo.findByCorreoAndContrasena(nombreCorreo, contrasena);
        return clienteOpt.orElse(null); // Si no encuentra al cliente, retorna null
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        // Lógica para registrar un nuevo cliente
        return clienteRepo.save(cliente);
    }
    @Override
    public boolean validarEstadoCliente(Cliente cliente) {
        // Verifica si el cliente tiene un estado válido
        if (cliente == null || cliente.getContrasena() == null || cliente.getNombre() == null || cliente.getCorreo() == null) {
            return false;  // Si alguno de los atributos es nulo, el estado es inválido
        }
        // Si el cliente está bloqueado, retornamos false (esta es solo una condición de ejemplo)
        return true;
    }


}
