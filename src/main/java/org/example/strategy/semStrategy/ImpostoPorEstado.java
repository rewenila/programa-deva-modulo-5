package org.example.strategy.semStrategy;

public class ImpostoPorEstado {
    public double calcularImposto(String estado, double valor) {
        if (estado.equals("SP")) {
            return valor * 0.08;
        } else if (estado.equals("RJ")) {
            return valor * 0.09;
        } else if (estado.equals("MG")) {
            return valor * 0.07;
        } else {
            throw new IllegalArgumentException("Estado não suportado: " + estado);
        }
    }

    public static void main(String[] args) {
        ImpostoPorEstado calculadora = new ImpostoPorEstado();

        double impostoSP = calculadora.calcularImposto("SP", 1000);
        System.out.println("Imposto para São Paulo: " + impostoSP);

        double impostoRJ = calculadora.calcularImposto("RJ", 1000);
        System.out.println("Imposto para Rio de Janeiro: " + impostoRJ);

        double impostoMG = calculadora.calcularImposto("MG", 1000);
        System.out.println("Imposto para Minas Gerais: " + impostoMG);
    }
}
