package edu.dosw.bitacora.bitacora_DOSW.semana3.patrones.command;

public class WalkCommand implements Command {
    private GameCharacter character;
    public WalkCommand(GameCharacter character) { this.character = character; }
    @Override
    public void execute() { character.walk(); }
}
