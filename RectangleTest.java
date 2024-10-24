package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testPerimeter() {
		Rectangle r1 = new Rectangle(new Point(0,0), new Point(0,0), new Point(0,0), new Point(0,0));
		assertEquals(r1.perimeter(), 0);
	}
	@Test
	void testisValid() {
		Rectangle r1 = new Rectangle(new Point(0,0), new Point(1,0), new Point(1,1), new Point(0,1));
		assertTrue(r1.isValid());
	}
	@Test
	void testisSquare1() {
		Rectangle r1 = new Rectangle(new Point(0,0), new Point(1,0), new Point(1,1), new Point(0,1));
		assertTrue(r1.isSquare());
	}
	@Test
	void testisSquare2() {
		Rectangle r1 = new Rectangle(new Point(0,0), new Point(1,0), new Point(0,2), new Point(1,2));
		assertFalse(r1.isSquare());
	}

}
