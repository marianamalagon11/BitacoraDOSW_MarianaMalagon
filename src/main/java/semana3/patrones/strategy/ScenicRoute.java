package semana3.patrones.strategy;

public class ScenicRoute implements RouteStrategy {
    @Override
    public void calculateRoute() {
        System.out.println("Calculando la ruta más escénica...");
    }
}
