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
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String concepto;
    private float monto;
    private String empresa;
    private String rolCreador;
    @Unique
    private String nombreEmpleadoCreador;
    private String rolUpdate;
    @Unique
    private String getNombreEmpleadoUpdate;
}



