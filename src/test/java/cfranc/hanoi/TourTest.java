package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayDeque;

public class TourTest {

	@Test
	public void testEmpiler_sameSize() {
        Tour tour = new Tour();

        Disque disque1 = new Disque(3);
        Disque disque2 = new Disque(3);
        assertEquals(true, tour.empiler(disque1));
        assertEquals(false, tour.empiler(disque2));
    }

    @Test
    public void testEmpiler_bigger() {
        Tour tour = new Tour();

        Disque disqueDiam3 = new Disque(3);
        assertEquals(true, tour.empiler(disqueDiam3));
        Disque disqueDiam4 = new Disque(4);
        assertEquals(false,tour.empiler(disqueDiam4));
	}

	@Test
    public void testEmpiler_smaller() {
        Tour tour = new Tour();

        Disque disqueDiam4 = new Disque(4);
        assertEquals(true, tour.empiler(disqueDiam4));
        Disque disqueDiam3 = new Disque(3);
        assertEquals(true,tour.empiler(disqueDiam3));
	}
}
