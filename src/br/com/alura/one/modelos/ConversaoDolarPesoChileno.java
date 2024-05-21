package br.com.alura.one.modelos;

public class ConversaoDolarPesoChileno implements Conversao{
    private final double taxaCambio;

    public ConversaoDolarPesoChileno(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor * taxaCambio;
    }
}


