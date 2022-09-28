package edu.udea.main.model;

public class Transaction {
    private String concepto;
    private float monto;
    private Enterprise empresa;
    private Employee rolCreador;
    private Employee nombreEmpleadoCreador;
    private Employee rolUpdate;
    private Employee getNombreEmpleadoUpdate;

    public Transaction(String concepto, float monto, Enterprise empresa, Employee rolCreador, Employee nombreEmpleadoCreador, Employee rolUpdate, Employee getNombreEmpleadoUpdate) {
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

    public Enterprise getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Enterprise empresa) {
        this.empresa = empresa;
    }

    public Employee getRolCreador() {
        return rolCreador;
    }

    public void setRolCreador(Employee rolCreador) {
        this.rolCreador = rolCreador;
    }

    public Employee getNombreEmpleadoCreador() {
        return nombreEmpleadoCreador;
    }

    public void setNombreEmpleadoCreador(Employee nombreEmpleadoCreador) {
        this.nombreEmpleadoCreador = nombreEmpleadoCreador;
    }

    public Employee getRolUpdate() {
        return rolUpdate;
    }

    public void setRolUpdate(Employee rolUpdate) {
        this.rolUpdate = rolUpdate;
    }

    public Employee getGetNombreEmpleadoUpdate() {
        return getNombreEmpleadoUpdate;
    }

    public void setGetNombreEmpleadoUpdate(Employee getNombreEmpleadoUpdate) {
        this.getNombreEmpleadoUpdate = getNombreEmpleadoUpdate;
    }
}
