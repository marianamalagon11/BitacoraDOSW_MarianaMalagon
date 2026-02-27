package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.adapter;

public class FastChargerAdapter implements FuelService {
    private FastElectricCharger charger;

    public FastChargerAdapter(FastElectricCharger charger) {
        this.charger = charger;
    }

    private double convertLitersToKWh(int liters) {
        return liters * 8.0;
    }

    @Override
    public void supply(int liters) {
        double kWh = convertLitersToKWh(liters);
        charger.fastCharge(kWh);
    }
}
