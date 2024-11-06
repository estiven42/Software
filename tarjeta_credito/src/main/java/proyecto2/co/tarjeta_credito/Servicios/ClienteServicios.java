package proyecto2.co.tarjeta_credito.Servicios;

import proyecto1.co.tarjeta_credito.Entidad.Cliente;

public interface ClienteServicios {
    Cliente validarCliente(String nombreCorreo, String contrasena);
    Cliente registrarCliente(Cliente cliente);
    boolean validarEstadoCliente(Cliente cliente);
}

