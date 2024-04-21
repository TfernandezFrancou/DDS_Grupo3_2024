package org.example;

public class Giro extends Envio {
    private Float importe;

    public Giro(EntidadEnvio destinatario, EntidadEnvio remitente, Float precio, int codigoDeRastreo, Float importe) {
        super(destinatario, remitente, precio, codigoDeRastreo);
        this.importe = importe;
    }

    @Override
    public void realizarEnvio() {
        System.out.printf("Realizando envio de giro con importe: %f", importe);
    }
}