package org.example;

public class Telegrama extends Envio {
    private String texto;
    private TipoTelegrama tipo;

    public Telegrama(EntidadEnvio destinatario, EntidadEnvio remitente, Float precio, int codigoDeRastreo, String texto, TipoTelegrama tipo) {
        super(destinatario, remitente, precio, codigoDeRastreo);
        this.texto = texto;
        this.tipo = tipo;
    }

    @Override
    public void realizarEnvio() {
        System.out.printf("Realizando envio de telegrama con texto: %s y tipo: %s", texto, tipo);
    }
}