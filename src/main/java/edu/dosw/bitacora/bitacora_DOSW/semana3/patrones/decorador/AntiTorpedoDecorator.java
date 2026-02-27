package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.decorador;

public class AntiTorpedoDecorator extends BarcoBaseDecorator {
    public AntiTorpedoDecorator(Barco barco) { super(barco); }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Sistema Antitorpedos";
    }
    @Override
    public int ataque() {
        return barco.ataque() + 20;
    }
}
