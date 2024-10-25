package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrapezoidTest {
	@Test
	void isParallelogramSquare() {
		Trapezoid t = new Trapezoid(
				new Point(1.0, 1.0),
				new Point(1.0, 2.0),
				new Point(2.0, 2.0),
				new Point(2.0, 1.0));
		assertTrue(t.isParallelogram());
	}
	@Test
	void isParallelogramShear() {
		Trapezoid t = new Trapezoid(
				new Point(-1.0, -1.0),
				new Point(-1.0, 0.0),
				new Point(1.0, 1.0),
				new Point(1.0, 0.0));
		assertTrue(t.isParallelogram());
	}
	@Test
	void isParallelogramBCNotEqualsDA() {
		Trapezoid t = new Trapezoid(
				new Point(1.0, 1.0),
				new Point(1.0, 2.0),
				new Point(2.0, 2.0),
				new Point(3.0, 2.0));
		assertFalse(t.isParallelogram());
	}
	@Test
	void isParallelogramABNotEqualsCD() {
		Trapezoid t = new Trapezoid(
				new Point(0.0, 1.0),
				new Point(1.0, 2.0),
				new Point(2.0, 2.0),
				new Point(0.0, 0.0));
		assertFalse(t.isParallelogram());
	}
	@Test
	void isParallelogramNoEqualSides() {
		Trapezoid t = new Trapezoid(
				new Point(0.0, 1.0),
				new Point(13.0, 2.0),
				new Point(5124.0, -2.0),
				new Point(0.0, -100000.6));
		assertFalse(t.isParallelogram());
	}
}
