package org.example;

import java.time.LocalDateTime;

public abstract class Envio {
    private EntidadEnvio destinatario, remitente;
    private Float precio;
    private RastreoEnvio rastreo;

    public Envio(EntidadEnvio destinatario, EntidadEnvio remitente, Float precio, int codigoDeRastreo) {
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.precio = precio;
        this.rastreo = new RastreoEnvio(codigoDeRastreo);
    }

    public Envio(EntidadEnvio destinatario, EntidadEnvio remitente, Float precio, RastreoEnvio rastreo) {
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.precio = precio;
        this.rastreo = rastreo;
    }

    public void pasarPorSucursal(Sucursal sucursal, LocalDateTime tiempoLlegada, LocalDateTime tiempoSalida) {
        this.rastreo.pasarPorSucursal(this, sucursal, tiempoLlegada, tiempoSalida);
    }

    public RastreoEnvio getRastreo() {
        return rastreo;
    }

    public boolean llegoADestino() {
        return rastreo.llegoADestino();
    }

    public abstract void realizarEnvio();
}