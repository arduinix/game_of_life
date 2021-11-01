package life;

import java.util.LinkedList;

public class Life {
    public LinkedList<Cell> universe;

    public Life() {
        this.universe = new LinkedList<Cell>();
    }

    public Life(LinkedList<Cell> universe) {
        this.universe = universe;
    }

    public void tick() {
        this.universe = new LinkedList<Cell>();
    }
}
