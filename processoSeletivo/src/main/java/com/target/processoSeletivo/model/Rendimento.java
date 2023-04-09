package com.target.processoSeletivo.model;

public class Rendimento {
    private int dia;
    private double valor;
    private static double valorTotal;
    public static double menorValor;
    public static double maiorValor;
    public static double mediaMensal ;
    private static int numberRendimento ;

    public Rendimento(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
        numberRendimento++;
        valorTotal += valor;

        if (valor < menorValor){
            menorValor = valor;
        }
        if (valor > maiorValor){
            maiorValor = valor;
        }

        mediaMensal = valorTotal/numberRendimento;

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

    public double getValorTotal() {
        return valorTotal;
    }
}
