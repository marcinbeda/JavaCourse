package designPatterns.functionalPatterns.observers;

import java.util.Observable;


public class ObservableTempValue extends Observable {

    private int oldTemp = 0;

    public void setValue(int newTemp) {
        if (newTemp != oldTemp) {
            super.setChanged();
            super.notifyObservers(newTemp);
            oldTemp = newTemp;
        }
    }

    public int getOldTemp() {
        return oldTemp;
    }
}
