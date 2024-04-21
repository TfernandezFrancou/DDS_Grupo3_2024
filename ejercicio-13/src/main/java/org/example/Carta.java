package org.example;

public class Carta extends Envio {
    private TipoCarta tipo;
    private Sellado sellado;

    public Carta(EntidadEnvio destinatario, EntidadEnvio remitente, Float precio, int codigoDeRastreo, TipoCarta tipo, Sellado sellado) {
        super(destinatario, remitente, precio, codigoDeRastreo);
        this.tipo = tipo;
        this.sellado = sellado;
    }

    @Override
    public void realizarEnvio() {
        System.out.printf("Realizando envio de carta con tipo: %s y sellado: %s", tipo, sellado);
    }
}