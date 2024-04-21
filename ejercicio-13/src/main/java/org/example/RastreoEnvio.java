package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class RastreoEnvio {
    private int codigoDeRastreo;
    private LocalDate fechaInicioEnvio, fechaLlegadaEnvio;
    private String nombreCartero;
    private ArrayList<SucursalRecorrida> sucursalesRecorridas;
    private boolean llegoADestino;

    public RastreoEnvio(int codigoDeRastreo) {
        this.codigoDeRastreo = codigoDeRastreo;
        this.fechaInicioEnvio = LocalDate.now();
        this.fechaLlegadaEnvio = LocalDate.MAX;
        this.nombreCartero = "";
        this.sucursalesRecorridas = new ArrayList<>();
        this.llegoADestino = false;
    }

    public RastreoEnvio(int codigoDeRastreo, LocalDate fechaInicioEnvio, LocalDate fechaLlegadaEnvio, String nombreCartero, ArrayList<SucursalRecorrida> sucursalesRecorridas, boolean llegoADestino) {
        this.codigoDeRastreo = codigoDeRastreo;
        this.fechaInicioEnvio = fechaInicioEnvio;
        this.fechaLlegadaEnvio = fechaLlegadaEnvio;
        this.nombreCartero = nombreCartero;
        this.sucursalesRecorridas = sucursalesRecorridas;
        this.llegoADestino = llegoADestino;
    }

    public boolean llegoADestino() {
        return this.llegoADestino;
    }

    public void pasarPorSucursal(Envio envio, Sucursal sucursal, LocalDateTime tiempoLlegada, LocalDateTime tiempoSalida) {
        this.sucursalesRecorridas.add(new SucursalRecorrida(envio, sucursal, tiempoLlegada, tiempoSalida));
    }

    public void marcarComoEntregado(String nombreCartero, LocalDate fechaLlegada) {
        this.nombreCartero = nombreCartero;
        this.llegoADestino = true;
        this.fechaLlegadaEnvio = fechaLlegada;
    }
}