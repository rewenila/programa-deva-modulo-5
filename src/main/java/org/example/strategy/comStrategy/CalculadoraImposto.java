package org.example.strategy.comStrategy;

public interface CalculadoraImposto {
    double calcularImposto(double valor);
}

class CalculadoraImpostoSP implements CalculadoraImposto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.08;
    }
}

class CalculadoraImpostoRJ implements CalculadoraImposto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.09;
    }
}

class CalculadoraImpostoMG implements CalculadoraImposto {
    @Override
    public double calcularImposto(double valor) {
        return valor * 0.07;
    }
}