package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.chainOfResponsability;

public class AntecedentesControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest req) {
        if (req.sinAntecedentes) {
            System.out.println("No hay antecedentes. Siguiente control...");
            if (siguiente != null) siguiente.procesar(req);
        } else {
            System.out.println("¡RECHAZADO por antecedentes!");
        }
    }
}
