package ee.ut.cs.swt.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleGT {

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    String string0 = triangle0.classify();
	    assertTrue(triangle0.isRightAngled());
	    assertEquals("impossible", string0);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsWithNegativeAndIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, (-1));
	    triangle0.setSideLengths((-1), 166, 3);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals("-1,166,3", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(1110, 795, (-3332));
	    triangle0.setSideLengths(1731, 2, 72);
	    double double0 = triangle0.getArea();
	    assertEquals("1731,2,72", triangle0.getSideLengths());
	    assertEquals(Double.NaN, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(174, 0, 174);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertTrue(boolean0);
	    assertFalse(triangle0.isScalene());
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereGetAreaIsZero() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, (-1));
	    triangle0.setSideLengths(2, 2, 3);
	    triangle0.classify();
	    assertEquals("2,2,3", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, (-1));
	    Triangle triangle1 = triangle0.setSideLengths(2, 3, 3);
	    boolean boolean0 = triangle1.isScalene();
	    assertEquals("scalene", triangle0.classify());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereIsEquilateralIsFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 5592, (-285));
	    triangle0.setSideLengths(0, 0, 5592);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("0,0,5592", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle((-1650), 1112, 1112);
	    triangle0.setSideLengths(0, 0, 0);
	    int int0 = triangle0.getPerimeter();
	    assertEquals("0,0,0", triangle0.getSideLengths());
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testIsImpossibleReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(3576, 1511, 3516);
	    boolean boolean0 = triangle0.isImpossible();
	    assertTrue(triangle0.isScalene());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, (-1));
	    double double0 = triangle0.getArea();
	    assertEquals("166,166,-1", triangle0.getSideLengths());
	    assertEquals((-1.0), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 5592, (-285));
	    Triangle triangle1 = triangle0.setSideLengths(0, 2, 5592);
	    boolean boolean0 = triangle1.isRightAngled();
	    assertEquals("0,2,5592", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsImpossible() throws Throwable {
	    Triangle triangle0 = new Triangle((-656), (-656), (-656));
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals("-656,-656,-656", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle(1792, 1792, (-2754));
	    int int0 = triangle0.getPerimeter();
	    assertEquals(830, int0);
	}

	@Test(timeout = 4000)
	public void testIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 5592, (-285));
	    Triangle triangle1 = triangle0.setSideLengths(0, 2, 5592);
	    boolean boolean0 = triangle1.isRightAngled();
	    assertEquals("0,2,5592", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), (-1), 0);
	    triangle0.setSideLengths((-1), 0, 504);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("-1,0,504", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), 0, 0);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals("-1,0,0", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle(174, 0, 174);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertTrue(boolean0);
	    assertFalse(triangle0.isScalene());
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereIsEquilateralIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(1110, 795, (-3332));
	    Triangle triangle1 = triangle0.setSideLengths(1110, 72, 1110);
	    String string0 = triangle1.classify();
	    assertEquals("1110,72,1110", triangle0.getSideLengths());
	    assertEquals("scalene", string0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(1792, 1792, (-2754));
	    int int0 = triangle0.getPerimeter();
	    assertEquals(830, int0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle((-717), 1, 3224);
	    Triangle triangle1 = triangle0.setSideLengths((-717), 1, (-303));
	    int int0 = triangle1.getPerimeter();
	    assertEquals((-1019), int0);
	}

	@Test(timeout = 4000)
	public void testIsImpossibleAndSetSideLengthsAndSetSideLengthsWithPositiveAndSetSideLengthsWithZero() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), 0, 0);
	    triangle0.setSideLengths(2, 1526, 0);
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals("2,1526,0", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsosceles0() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), 0, 0);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals("-1,0,0", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles1() throws Throwable {
	    Triangle triangle0 = new Triangle(174, 8, 174);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals(695.8160676500651, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, (-1));
	    double double0 = triangle0.getArea();
	    assertEquals("166,166,-1", triangle0.getSideLengths());
	    assertEquals((-1.0), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningZero() throws Throwable {
	    Triangle triangle0 = new Triangle((-1650), 1112, 1112);
	    triangle0.setSideLengths(0, 0, 0);
	    int int0 = triangle0.getPerimeter();
	    assertEquals("0,0,0", triangle0.getSideLengths());
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, (-1));
	    triangle0.setSideLengths((-1), 166, 3);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals("-1,166,3", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScalene0() throws Throwable {
	    Triangle triangle0 = new Triangle(174, 8, 174);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals("174,8,174", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsScalene1() throws Throwable {
	    Triangle triangle0 = new Triangle(57, 57, 57);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals("57,57,57", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(3576, 1511, 3516);
	    double double0 = triangle0.getArea();
	    assertEquals("scalene", triangle0.classify());
	    assertEquals(19557.175409552372, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsWithNegativeAndIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, 166);
	    triangle0.setSideLengths(166, (-245), 152);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(triangle0.isScalene());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereIsEquilateralIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), 0, 0);
	    triangle0.setSideLengths(0, 3, 0);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("0,3,0", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateral() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, (-1));
	    boolean boolean0 = triangle0.isEquilateral();
	    assertFalse(boolean0);
	    assertEquals("166,166,-1", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereGetPerimeterIsNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(538, 538, 538);
	    triangle0.setSideLengths((-2816), 538, (-1));
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(triangle0.isScalene());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsEquilateral() throws Throwable {
	    Triangle triangle0 = new Triangle(119, 119, 119);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(boolean0);
	    assertEquals("equilateral", triangle0.classify());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle((-2194), (-2194), (-2194));
	    String string0 = triangle0.getSideLengths();
	    assertEquals("-2194,-2194,-2194", string0);
	}

	@Test(timeout = 4000)
	public void testClassify0() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    String string0 = triangle0.classify();
	    assertTrue(triangle0.isRightAngled());
	    assertEquals("impossible", string0);
	}

	@Test(timeout = 4000)
	public void testClassify1() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, 22);
	    String string0 = triangle0.classify();
	    assertEquals(1821.9865531885794, triangle0.getArea(), 0.01);
	    assertEquals("isossceles", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle(176, 8, 174);
	    boolean boolean0 = triangle0.isScalene();
	    assertTrue(boolean0);
	    assertEquals(677.5950117880149, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testClassify2() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, 166);
	    String string0 = triangle0.classify();
	    assertEquals("equilateral", string0);
	}

	@Test(timeout = 4000)
	public void testClassify3() throws Throwable {
	    Triangle triangle0 = new Triangle(22, (-2760), (-2760));
	    String string0 = triangle0.classify();
	    assertEquals("impossible", string0);
	    assertEquals("22,-2760,-2760", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsImpossible() throws Throwable {
	    Triangle triangle0 = new Triangle((-656), (-656), (-656));
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals("-656,-656,-656", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningZero() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, (-1));
	    Triangle triangle1 = triangle0.setSideLengths(2, 3, 2);
	    double double0 = triangle1.getArea();
	    assertEquals("2,3,2", triangle0.getSideLengths());
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(1110, 795, (-3332));
	    Triangle triangle1 = triangle0.setSideLengths(1110, 72, 1110);
	    String string0 = triangle1.classify();
	    assertEquals("1110,72,1110", triangle0.getSideLengths());
	    assertEquals("scalene", string0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(119, 119, 119);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(boolean0);
	    assertEquals("equilateral", triangle0.classify());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), (-1), 0);
	    triangle0.setSideLengths((-1), 0, 504);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("-1,0,504", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengthsAndSetSideLengthsReturningTriangleWhereIsEquilateralIsFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(166, 166, (-1));
	    triangle0.setSideLengths(2, 3, 3);
	    triangle0.classify();
	    assertEquals(2.8284271247461903, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testIsImpossibleAndSetSideLengthsAndSetSideLengthsWithZeroAndSetSideLengthsWithPositive() throws Throwable {
	    Triangle triangle0 = new Triangle((-643), 0, 1644);
	    Triangle triangle1 = triangle0.setSideLengths(1644, 0, 1387);
	    boolean boolean0 = triangle1.isImpossible();
	    assertEquals(3031, triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(176, 8, 174);
	    boolean boolean0 = triangle0.isScalene();
	    assertTrue(boolean0);
	    assertEquals(677.5950117880149, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle((-2194), (-2194), (-2194));
	    String string0 = triangle0.getSideLengths();
	    assertEquals("-2194,-2194,-2194", string0);
	}

}