import java.util.*;

class Memento {
    private final List<Integer> state;

    public Memento(List<Integer> state) {
        this.state = new ArrayList<>(state);
    }

    public List<Integer> getState() {
        return new ArrayList<>(state);
    }
}

class Originator {
    private List<Integer> numbers = new ArrayList<>();

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    public Memento/* specify type */ getMemento() {
        return new Memento(numbers);

    }

    public void setMemento(/* specify type */ Memento memento) {
        numbers = new ArrayList<>(memento.getState());

    }
}

class Caretaker {
    private final Originator originator;
    private Memento snapshot/* specify type */  = null;

    Caretaker(Originator originator) {

        this.originator = originator;
    }

    public void save() {

        snapshot = originator.getMemento();
    }

    public void restore() {
        if (snapshot != null) {
            originator.setMemento(snapshot);
        }
    }
}