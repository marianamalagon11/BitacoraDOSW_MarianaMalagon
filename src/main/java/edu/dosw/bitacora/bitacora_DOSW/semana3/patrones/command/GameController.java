package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.command;

public class GameController {
    public void pressButton(Command command) {
        command.execute();
    }
}