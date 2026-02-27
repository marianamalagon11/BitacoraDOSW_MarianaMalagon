package semana3.patrones.adapter;

public class SlowChargerAdapter implements FuelService {
    private SlowElectricCharger charger;

    public SlowChargerAdapter(SlowElectricCharger charger) {
        this.charger = charger;
    }

    private double convertLitersToKWh(int liters) {
        return liters * 7.0;
    }

    @Override
    public void supply(int liters) {
        double kWh = convertLitersToKWh(liters);
        charger.slowCharge(kWh);
    }
}
