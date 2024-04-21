package org.example;

public class Encomienda extends Envio {
    private TipoEncomienda tipo;

    public Encomienda(EntidadEnvio destinatario, EntidadEnvio remitente, Float precio, int codigoDeRastreo, TipoEncomienda tipo) {
        super(destinatario, remitente, precio, codigoDeRastreo);
        this.tipo = tipo;
    }

    @Override
    public void realizarEnvio() {
        System.out.printf("Realizando envio de encomienda con tipo: %s", tipo);
    }
}