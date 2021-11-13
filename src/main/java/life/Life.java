package life;

import java.util.LinkedList;

public class Life {
    public LinkedList<Cell> universe;
    public Cell northOffset = new Cell(0, 1);
    public Cell southOffset = new Cell(0, -1);
    public Cell eastOffset = new Cell(1, 0);
    public Cell westOffset = new Cell(-1, 0);
    public Cell nwOffset = new Cell(-1, 1);
    public Cell neOffset = new Cell(1, 1);
    public Cell swOffset = new Cell(-1, -1);
    public Cell seOffset = new Cell(1, -1);

    public Life() {
        this.universe = new LinkedList<Cell>();
    }

    public Life(LinkedList<Cell> universe) {
        this.universe = universe;
    }

    public void tick() {
        this.universe = new LinkedList<Cell>();
    }

    public boolean checkNeighbor(Cell inputCell, Cell offset) {
        for (Cell cell : universe) {
            if (cell.x == inputCell.x + offset.x && cell.y == inputCell.y + offset.y) {
                return true;
            }
        }
        return false;
    }
}
