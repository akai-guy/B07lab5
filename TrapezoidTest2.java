package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrapezoidTest2 {

	@Test
	void testPerimeter() {
		Trapezoid t1 = new Trapezoid(new Point(0,0), new Point(2,2), new Point(4,2), new Point(6,0));
		assertEquals(t1.perimeter(), 8 + 2*Math.sqrt(8));
	}
	
	@Test
	void testIsParallelogram() {
		Trapezoid t1 = new Trapezoid(new Point(0,0), new Point(0,1), new Point(1,1), new Point(1,0));
		assertTrue(t1.isParallelogram());
	}
	
	@Test
	void testIsNotParallelogram() {
		Trapezoid t1 = new Trapezoid(new Point(0,0), new Point(2,2), new Point(4,2), new Point(6,0));
		assertFalse(t1.isParallelogram());
	}
	
	@Test
	void testIsNotParallelogram2() {
		Trapezoid t1 = new Trapezoid(new Point(0,0), new Point(4,2), new Point(2,2), new Point(6,0));
		assertFalse(t1.isParallelogram());
	}
	
	@Test
	void testIsNotParallelogram3() {
		Trapezoid t1 = new Trapezoid(new Point(0,0), new Point(40,2), new Point(2,2), new Point(6,0));
		assertFalse(t1.isParallelogram());
	}
	
	
	

}
