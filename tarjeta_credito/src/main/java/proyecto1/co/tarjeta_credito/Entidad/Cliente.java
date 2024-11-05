package proyecto1.co.tarjeta_credito.Entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLIENTE")
    @SequenceGenerator(name = "SEQ_CLIENTE", sequenceName = "SEQ_CLIENTE", allocationSize = 1)
    @Column(name = "CLI_CODIGO")
    private long serial;

    @Column(name = "CLI_nombre")
    private String nombre;

    @Column(name = "CLI_correo")
    private String correo;

    @Column(name = "CLI_contrasena")
    private String contrasena;

    // Otros campos según sea necesario
}
