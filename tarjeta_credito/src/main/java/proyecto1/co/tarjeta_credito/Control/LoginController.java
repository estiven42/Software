package proyecto1.co.tarjeta_credito.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import proyecto1.co.tarjeta_credito.Entidad.Cliente;
import proyecto1.co.tarjeta_credito.Servicios.ClienteServicios;

@Controller
public class LoginController {

    @Autowired
    private ClienteServicios clienteServicios;

    @GetMapping("/Login")
    public String mostrarFormularioLogin(Model model) {
        // Mostrar el formulario de inicio de sesión
        return "login"; // Retorna la vista "login.html"
    }

    @PostMapping("/Login")
    public String validarUsuario(@RequestParam("nombreCorreo") String nombreCorreo,
                                 @RequestParam("contrasena") String contrasena,
                                 Model model) {
        Cliente cliente = clienteServicios.validarCliente(nombreCorreo, contrasena);
        if (cliente != null) {
            // Redirigir a la página principal del usuario
            return "redirect:/paginaPrincipal"; // Cambia por tu vista principal
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos.");
            return "login"; // Regresar al formulario de login
        }
    }
}
