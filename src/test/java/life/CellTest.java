package life;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {
    @Test
    public void aCellIsASimplePairOfIntegers() {
        int x = 0;
        int y = 0;
        Cell cell = new Cell(x, y);

        assertEquals(cell.x, x);
        assertEquals(cell.y, y);
    }
}