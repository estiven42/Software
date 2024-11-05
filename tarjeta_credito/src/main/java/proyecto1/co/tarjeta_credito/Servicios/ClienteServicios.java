package proyecto1.co.tarjeta_credito.Servicios;

import proyecto1.co.tarjeta_credito.Entidad.Cliente;

public interface ClienteServicios {
    Cliente validarCliente(String nombreCorreo, String contrasena);
    Cliente registrarCliente(Cliente cliente);
    // Otros métodos según sea necesario
}
