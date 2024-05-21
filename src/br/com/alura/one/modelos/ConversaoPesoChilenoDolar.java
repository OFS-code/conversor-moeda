package br.com.alura.one.modelos;

public class ConversaoPesoChilenoDolar implements Conversao {
    private final double taxaCambio;

    public ConversaoPesoChilenoDolar(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor / taxaCambio;
    }
}
