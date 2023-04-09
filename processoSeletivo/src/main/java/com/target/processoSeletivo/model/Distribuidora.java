package model;

public class Distribuidora {
    private String estado;
    private double valor;

    private static double total;

    public Distribuidora(String estado, double valor) {
        this.estado = estado;
        this.valor = valor;
        this.total += valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public double percentual(){
        return (valor/total)*100;
    }
}
