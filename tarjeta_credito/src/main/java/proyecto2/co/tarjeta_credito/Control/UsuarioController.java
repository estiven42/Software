package proyecto2.co.tarjeta_credito.Control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto1.co.tarjeta_credito.Entidad.Cliente;
import proyecto2.co.tarjeta_credito.Repositorio.ClienteRepo;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private ClienteRepo usuarioRepository;

    @PostMapping("/registrar")
    public Cliente registrarUsuario(@RequestBody Cliente usuario) {
        return usuarioRepository.save(usuario);
    }
}
