package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.decorador;

public class BarcoBase implements Barco {
    @Override
    public String getDescripcion() {
        return "Barco básico";
    }
    @Override
    public int ataque() {
        return 50;
    }
    @Override
    public int defensa() {
        return 60;
    }
}