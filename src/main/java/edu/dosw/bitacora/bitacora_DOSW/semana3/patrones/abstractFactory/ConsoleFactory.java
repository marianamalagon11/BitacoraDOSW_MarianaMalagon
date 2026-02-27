package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.abstractFactory;

public interface ConsoleFactory {
    Controller createController();
    UI createUI();
    Game createGame();
}
