package edu.udea.main.model;

import lombok.ToString;
import org.checkerframework.common.aliasing.qual.Unique;

import javax.persistence.*;

@Entity
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

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Transaction(String concepto, float monto, String empresa, String rolCreador, String nombreEmpleadoCreador, String rolUpdate, String getNombreEmpleadoUpdate) {
        this.concepto = concepto;
        this.monto = monto;
        this.empresa = empresa;
        this.rolCreador = rolCreador;
        this.nombreEmpleadoCreador = nombreEmpleadoCreador;
        this.rolUpdate = rolUpdate;
        this.getNombreEmpleadoUpdate = getNombreEmpleadoUpdate;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRolCreador() {
        return rolCreador;
    }

    public void setRolCreador(String rolCreador) {
        this.rolCreador = rolCreador;
    }

    public String getNombreEmpleadoCreador() {
        return nombreEmpleadoCreador;
    }

    public void setNombreEmpleadoCreador(String nombreEmpleadoCreador) {
        this.nombreEmpleadoCreador = nombreEmpleadoCreador;
    }

    public String getRolUpdate() {
        return rolUpdate;
    }

    public void setRolUpdate(String rolUpdate) {
        this.rolUpdate = rolUpdate;
    }

    public String getGetNombreEmpleadoUpdate() {
        return getNombreEmpleadoUpdate;
    }

    public void setGetNombreEmpleadoUpdate(String getNombreEmpleadoUpdate) {
        this.getNombreEmpleadoUpdate = getNombreEmpleadoUpdate;
    }
}
