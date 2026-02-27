package semana3.patrones.abstractFactory;

public class XboxController implements Controller{
    @Override
    public void connect() {
        System.out.println("Conectando control de Xbox...");
    }
}
