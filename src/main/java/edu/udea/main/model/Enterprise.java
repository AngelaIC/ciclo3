package edu.udea.main.model;

import lombok.*;
import org.checkerframework.common.aliasing.qual.Unique;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Unique
    private String nombreEmpresa;
    private String direccion;
    private String telefono;
    private String NIT;
    @Unique
    private String nombreEmpleado;
    @Unique
    private String documentoEmpleado;
    private Transaction[] transaccion;
}
