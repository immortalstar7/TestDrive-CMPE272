/**
 * Write a description of class Memento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    public class Memento {
        private final String state;
 
        public Memento(String stateToSave) {
            state = stateToSave;
        }
 
        public String getSavedState() {
            return state;   
        }
    }

