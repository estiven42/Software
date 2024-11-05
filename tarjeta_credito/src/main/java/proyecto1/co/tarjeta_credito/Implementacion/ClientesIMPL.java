package proyecto1.co.tarjeta_credito.Implementacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto1.co.tarjeta_credito.Entidad.Cliente;
import proyecto1.co.tarjeta_credito.Repositorio.ClienteRepo;
import proyecto1.co.tarjeta_credito.Servicios.ClienteServicios;

import java.util.List;

@Service
public class ClientesIMPL implements ClienteServicios {

    @Autowired
    private ClienteRepo clienteRepo;

    @Override
    public Cliente validarCliente(String nombreCorreo, String contrasena) {
        List<Cliente> clientes = clienteRepo.findByCorreo(nombreCorreo);
        for (Cliente cliente : clientes) {
            if (cliente.getContrasena().equals(contrasena)) {
                return cliente; // Usuario validado
            }
        }
        return null; // Usuario no encontrado
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        // Lógica para registrar un nuevo cliente
        return clienteRepo.save(cliente);
    }
}
