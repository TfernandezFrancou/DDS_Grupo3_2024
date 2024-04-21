package org.example;

import java.util.ArrayList;
import java.util.Set;

public class Sucursal {
    private String direccion;
    private String localidad;
    private Set<String> empleados;
    private ArrayList<Envio> envios;

    public Sucursal(String direccion, String localidad, Set<String> empleados, ArrayList<Envio> envios) {
        this.direccion = direccion;
        this.localidad = localidad;
        this.empleados = empleados;
        this.envios = envios;
    }

    public boolean llegoADestinoEnvio(Envio envio) {
        return envio.llegoADestino();
    }
}