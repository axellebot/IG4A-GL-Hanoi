package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayDeque;

public class TourTest {

	@Test
	public void testEmpiler() {
		Tour tour = new Tour();

		Disque disqueDiam3 = new Disque(3);
        assertEquals(true,tour.empiler(disqueDiam3));
        assertEquals(false,tour.empiler(disqueDiam3));

        Disque disqueDiam4 = new Disque(4);
        assertEquals(false,tour.empiler(disqueDiam4));

        assertEquals(false,tour.empiler(disqueDiam4));

        Disque disqueDiam2 = new Disque(2);
        assertEquals(true,tour.empiler(disqueDiam2));
	}
}
