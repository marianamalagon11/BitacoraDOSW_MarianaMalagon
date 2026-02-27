package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.strategy;

public class NavigationApp {
    private RouteStrategy routeStrategy;

    public NavigationApp(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void startNavigation() {
        routeStrategy.calculateRoute();
    }
}
