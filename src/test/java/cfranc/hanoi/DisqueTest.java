package cfranc.hanoi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisqueTest {

    @Test
    public void testCompareTo() {
        Disque petit = new Disque(1),
                moyen = new Disque(2),
                grand = new Disque(3),
                grand2= new Disque(3);

        assertEquals(-1, petit.compareTo(grand));
        assertEquals(-1, petit.compareTo(moyen));

        assertEquals(-1, moyen.compareTo(grand));
        assertEquals(1, moyen.compareTo(petit));

        assertEquals(1, grand.compareTo(petit));
        assertEquals(1, grand.compareTo(moyen));
        assertEquals(0,grand.compareTo(grand2));

    }

}
