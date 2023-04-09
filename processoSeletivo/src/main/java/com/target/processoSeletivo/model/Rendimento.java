package com.target.processoSeletivo.model;

public class Rendimento {
    private int dia;
    private double valor;
    private double menorValor;
    private double maiorValor;
    private double mediaMensal;

    public Rendimento(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getMenorValor() {
        return menorValor;
    }

    public double getMaiorValor() {
        return maiorValor;
    }

    public double getMediaMensal() {
        return mediaMensal;
    }
}
