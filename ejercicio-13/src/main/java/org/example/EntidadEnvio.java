package org.example;

public class EntidadEnvio {
    private String nombre;
    private String direccion;
    private String codigoPostal;
    private String localidad;

    public EntidadEnvio(String nombre, String direccion, String codigoPostal, String localidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
    }
}