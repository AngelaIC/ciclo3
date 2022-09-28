package edu.udea.main.model;

public class Enterprise {
    private String nombreEmpresa;
    private String direccion;
    private String telefono;
    private String NIT;
    private Employee nombreEmpleado;
    private Employee documento;
    private Transaction[] transaccion;

    public Enterprise(String nombreEmpresa, String direccion, String telefono, String NIT, Employee nombreEmpleado, Employee documento, Transaction[] transaccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
        this.nombreEmpleado = nombreEmpleado;
        this.documento = documento;
        this.transaccion = transaccion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public Employee getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(Employee nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Employee getDocumento() {
        return documento;
    }

    public void setDocumento(Employee documento) {
        this.documento = documento;
    }

    public Transaction[] getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaction[] transaccion) {
        this.transaccion = transaccion;
    }
}
