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
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Unique
    private String nombreEmpleado;
    @Unique
    private Integer documentoEmpleado;
    @Unique
    private String emailEmpleado;
    private String empresaEmpleado;
    private String rolEmpleado;
    private Transaction[] transaccion;
}

