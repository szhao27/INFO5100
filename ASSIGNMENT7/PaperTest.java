package a7;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaperTest {

    @Test
    public void fight() {
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        assertTrue(s.fight(p));
        assertFalse(p.fight(r));
    }
}