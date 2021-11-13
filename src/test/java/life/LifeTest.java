package life;

import org.junit.Test;
import java.util.LinkedList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LifeTest {
    // Universe Tests
    @Test
    public void newUniverseIsEmpty() {
        Life life = new Life();
        LinkedList<Cell> expectedUniverse = new LinkedList<Cell>();

        assertEquals(life.universe, expectedUniverse);
    }

    @Test
    public void aUniverseWithJustOneCell_dies() {
        Cell liveCell_1_1 = new Cell(1,1);
        LinkedList<Cell> oneCellUniverse = new LinkedList<Cell>();
        oneCellUniverse.add(liveCell_1_1);
        LinkedList<Cell> expectedUniverse = new LinkedList<Cell>();

        Life life = new Life(oneCellUniverse);
        life.tick();

        assertEquals(life.universe, expectedUniverse);
    }

    @Test
    public void aUniverseWithTwoCellsNotNearEachOther_bothDie() {
        Cell liveCell_1_1 = new Cell(1,1);
        Cell liveCell_10_10 = new Cell(10,10);
        LinkedList<Cell> twoCellUniverse = new LinkedList<Cell>();
        twoCellUniverse.add(liveCell_1_1);
        twoCellUniverse.add(liveCell_10_10);
        LinkedList<Cell> expectedUniverse = new LinkedList<Cell>();

        Life life = new Life(twoCellUniverse);
        life.tick();

        assertEquals(life.universe, expectedUniverse);
    }

    // Neighbor Tests
    @Test
    public void canVerifyAllCellNeighbors() {
        Cell liveCell_1_1 = new Cell(1, 1);
        Cell northCell = new Cell(1, 2);
        Cell southCell = new Cell(1 ,0);
        Cell eastCell = new Cell(2, 1);
        Cell westCell = new Cell(0, 1);
        Cell nwCell = new Cell(2, 0);
        Cell neCell = new Cell(2, 2);
        Cell swCell = new Cell(0, 0);
        Cell seCell = new Cell(0, 2);
        LinkedList<Cell> universe = new LinkedList<Cell>();
        universe.add(liveCell_1_1);
        universe.add(northCell);
        universe.add(southCell);
        universe.add(eastCell);
        universe.add(westCell);
        universe.add(nwCell);
        universe.add(neCell);
        universe.add(swCell);
        universe.add(seCell);

        Life life = new Life(universe);

        assertEquals(true, life.checkNeighbor(liveCell_1_1, life.northOffset));
        assertEquals(true, life.checkNeighbor(liveCell_1_1, life.southOffset));
        assertEquals(true, life.checkNeighbor(liveCell_1_1, life.eastOffset));
        assertEquals(true, life.checkNeighbor(liveCell_1_1, life.westOffset));
        assertEquals(true, life.checkNeighbor(liveCell_1_1, life.nwOffset));
        assertEquals(true, life.checkNeighbor(liveCell_1_1, life.neOffset));
        assertEquals(true, life.checkNeighbor(liveCell_1_1, life.swOffset));
        assertEquals(true, life.checkNeighbor(liveCell_1_1, life.seOffset));
    }
}
