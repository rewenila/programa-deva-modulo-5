package org.example.strategy.comStrategy;

public class ImpostoBrasil {

    public static void main(String[] args) {
        ImpostoPorEstado calculadoraSP = new org.example.strategy.comStrategy.ImpostoPorEstado(new org.example.strategy.comStrategy.CalculadoraImpostoSP());
        double impostoSP = calculadoraSP.calcularImposto(1000);
        System.out.println("Imposto para São Paulo: " + impostoSP);

        org.example.strategy.comStrategy.ImpostoPorEstado calculadoraRJ = new org.example.strategy.comStrategy.ImpostoPorEstado(new org.example.strategy.comStrategy.CalculadoraImpostoRJ());
        double impostoRJ = calculadoraRJ.calcularImposto(1000);
        System.out.println("Imposto para Rio de Janeiro: " + impostoRJ);

        org.example.strategy.comStrategy.ImpostoPorEstado calculadoraMG = new org.example.strategy.comStrategy.ImpostoPorEstado(new org.example.strategy.comStrategy.CalculadoraImpostoMG());
        double impostoMG = calculadoraMG.calcularImposto(1000);
        System.out.println("Imposto para Minas Gerais: " + impostoMG);
    }

}
