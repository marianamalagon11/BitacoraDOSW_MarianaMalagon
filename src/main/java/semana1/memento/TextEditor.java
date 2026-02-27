package semana1.memento;

public class TextEditor {
    private String text;

    public void setText(String newText) {
        this.text = newText;
    }

    public String getText() {
        return text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        this.text = memento.getText();
    }
}
