package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.chainOfResponsability;

public interface ControlMigratorio {
    void setSiguiente(ControlMigratorio siguiente);
    void procesar(IngresoRequest req);
}
