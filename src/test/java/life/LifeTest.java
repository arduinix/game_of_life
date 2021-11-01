package life;

import org.junit.Test;
import java.util.LinkedList;
import static org.junit.Assert.assertEquals;

public class LifeTest {
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
}
