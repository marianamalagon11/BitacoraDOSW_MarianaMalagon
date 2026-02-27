package semana3.patrones.decorador;

public class RadarDecorator extends BarcoBaseDecorator {
    public RadarDecorator(Barco barco) { super(barco); }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Radar Avanzado";
    }
    @Override
    public int ataque() {
        return barco.ataque() + 10;
    }
}
