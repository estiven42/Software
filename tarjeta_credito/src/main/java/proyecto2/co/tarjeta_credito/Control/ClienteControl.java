package proyecto2.co.tarjeta_credito.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import proyecto1.co.tarjeta_credito.Entidad.Cliente;
import proyecto1.co.tarjeta_credito.Servicios.ClienteServicios;

@Controller
public class ClienteControl {

    @Autowired
    private ClienteServicios clienteServicios;

    @GetMapping("/Inicio")
    public String mostrarFormularioLogin(Model model) {
        // Mostrar el formulario de inicio de sesión
        return "Inicio"; // Retorna la vista "Inicio.html"
    }

    @PostMapping("/Inicio")
    public String validarUsuario(@RequestParam("nombreCorreo") String nombreCorreo,
                                 @RequestParam("contrasena") String contrasena,
                                 Model model) {
        if (nombreCorreo == null || contrasena == null || nombreCorreo.isEmpty() || contrasena.isEmpty()) {
            model.addAttribute("error", "Usuario o contraseña no pueden estar vacíos.");
            return "Inicio"; // Regresar al formulario de login
        }

        Cliente cliente = clienteServicios.validarCliente(nombreCorreo, contrasena);
        if (cliente != null && clienteServicios.validarEstadoCliente(cliente)) {
            return "redirect:/paginaPrincipal"; // Redirige si las credenciales son correctas
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos.");
            return "Inicio"; // Regresar al formulario de login
        }
    }

}
