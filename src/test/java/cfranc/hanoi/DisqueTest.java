package cfranc.hanoi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisqueTest {

    private Disque petit = new Disque(1),
            moyen = new Disque(2),
            grand = new Disque(3),
            grand2 = new Disque(3);

    @Test
    public void testCompareTo_small() {
        assertEquals(-1, petit.compareTo(grand));
        assertEquals(-1, petit.compareTo(moyen));
    }

    @Test
    public void testCompareTo_moyen() {
        assertEquals(-1, moyen.compareTo(grand));
        assertEquals(1, moyen.compareTo(petit));
    }

    @Test
    public void testCompareTo_grand() {
        assertEquals(1, grand.compareTo(petit));
        assertEquals(1, grand.compareTo(moyen));
    }

    @Test
    public void testCompareTo_same(){
        assertEquals(0, grand.compareTo(grand2));
    }
}
