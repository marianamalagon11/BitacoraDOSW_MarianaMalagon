package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.strategy;

public class CheapestRoute implements RouteStrategy {
    @Override
    public void calculateRoute() {
        System.out.println("Calculando la ruta más económica...");
    }
}
