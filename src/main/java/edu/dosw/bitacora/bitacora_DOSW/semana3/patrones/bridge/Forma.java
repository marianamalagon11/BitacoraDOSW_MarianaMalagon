package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.bridge;

public abstract class Forma {
    protected Color color;

    public Forma(Color color) {
        this.color = color;
    }

    public abstract void dibujar();
}
