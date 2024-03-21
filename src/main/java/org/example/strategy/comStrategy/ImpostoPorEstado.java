package org.example.strategy.comStrategy;

public class ImpostoPorEstado {
    private final org.example.strategy.comStrategy.CalculadoraImposto calculadora;

    public ImpostoPorEstado(org.example.strategy.comStrategy.CalculadoraImposto calculadora) {
        this.calculadora = calculadora;
    }

    public double calcularImposto(double valor) {
        return calculadora.calcularImposto(valor);
    }
}
