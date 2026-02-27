package semana1.memento;

import java.util.ArrayList;

public class History {
    private final ArrayList<TextMemento> states = new ArrayList<>();

    public void add(TextMemento memento) {
        states.add(memento);
    }

    public TextMemento get(int index) {
        return states.get(index);
    }
}
