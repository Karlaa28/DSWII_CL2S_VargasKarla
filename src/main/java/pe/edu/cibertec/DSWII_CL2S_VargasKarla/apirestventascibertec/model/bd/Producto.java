package pe.edu.cibertec.DSWII_CL2S_VargasKarla.apirestventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "fechaVencimiento")
    private Date fechaVencimiento;
}