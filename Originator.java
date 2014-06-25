/**
 * Write a description of class Originator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   import java.util.List;
import java.util.ArrayList;
    // instance variables - replace the example below with your own

class Originator {
    private String state;
    // The class could also contain additional data that is not part of the
    // state saved in the memento..
 
    public void set(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }
 
    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }
 
    public String restoreFromMemento(Memento memento) {
        state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    return state;
    }
}
