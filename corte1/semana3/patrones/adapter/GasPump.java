package semana3.patrones.adapter;

public class GasPump implements FuelService {
    @Override
    public void supply(int liters) {
        System.out.println("Abasteciendo " + liters + " litros de combustible.");
    }
}
