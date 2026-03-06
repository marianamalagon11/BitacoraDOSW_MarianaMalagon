package semana3.patrones.command;

public class JumpCommand implements Command {
    private GameCharacter character;
    public JumpCommand(GameCharacter character) { this.character = character; }
    @Override
    public void execute() { character.jump(); }
}
