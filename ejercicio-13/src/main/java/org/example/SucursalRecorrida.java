package org.example;

import java.time.LocalDateTime;

public class SucursalRecorrida {
    private Envio envio;
    private Sucursal sucursal;
    private LocalDateTime tiempoLlegada, tiempoSalida;

    public SucursalRecorrida(Envio envio, Sucursal sucursal, LocalDateTime tiempoLlegada, LocalDateTime tiempoSalida) {
        this.envio = envio;
        this.sucursal = sucursal;
        this.tiempoLlegada = tiempoLlegada;
        this.tiempoSalida = tiempoSalida;
    }
}