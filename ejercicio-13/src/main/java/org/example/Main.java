package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Sucursal sucursal1 = new Sucursal("Santa Fe 3333", "CABA", new HashSet<>(), new ArrayList<>());
        Sucursal sucursal2 = new Sucursal("9 de Julio 3333", "CABA", new HashSet<>(), new ArrayList<>());
        Sucursal sucursal3 = new Sucursal("Cordoba 3333", "CABA", new HashSet<>(), new ArrayList<>());

        EntidadEnvio entidad1 = new EntidadEnvio("Marcelo Perez", "Direccion 1111", "1333", "CABA");
        EntidadEnvio entidad2 = new EntidadEnvio("Armando Rodriguez", "Direccion 2222", "4444", "CABA");

        Telegrama t = new Telegrama(entidad1, entidad2, 1000f, 1, "Hola soy el telegrama", TipoTelegrama.CartaDocumento);
        t.pasarPorSucursal(sucursal1, LocalDateTime.now(), LocalDateTime.now());
        t.pasarPorSucursal(sucursal2, LocalDateTime.now(), LocalDateTime.now());
        t.pasarPorSucursal(sucursal3, LocalDateTime.now(), LocalDateTime.now());
        t.getRastreo().marcarComoEntregado("Juan", LocalDate.now());
    }
}