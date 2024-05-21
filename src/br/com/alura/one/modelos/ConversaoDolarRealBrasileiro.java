package br.com.alura.one.modelos;

public class ConversaoDolarRealBrasileiro implements Conversao {
    private final double taxaCambio;

    public ConversaoDolarRealBrasileiro(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor * taxaCambio;
    }
}