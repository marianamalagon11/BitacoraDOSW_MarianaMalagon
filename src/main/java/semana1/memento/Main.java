package semana1.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Primera versión");
        history.add(editor.save());

        editor.setText("Segunda versión");
        history.add(editor.save());

        editor.setText("Tercera versión");

        // Deshacer (restore a versión 1)
        editor.restore(history.get(0));
        System.out.println("Contenido actual: " + editor.getText());
    }
}
