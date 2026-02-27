package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.strategy;

public class FastestRoute implements RouteStrategy {
    @Override
    public void calculateRoute() {
        System.out.println("Calculando la ruta más rápida...");
    }
}
