package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate((-808), (-808), (-808));
	    String string0 = nextDate0.run(12, 15, 1870);
	    assertEquals("12/16/1870", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, (-740), 8);
	    String string0 = nextDate0.run(9, 30, 1912);
	    assertEquals("10/1/1912", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1), (-730), 8);
	    String string0 = nextDate0.run(11, 3, 1865);
	    assertEquals("11/4/1865", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1912);
	    assertEquals("5/6/1912", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 1846);
	    assertEquals("10/11/1846", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 29, 1980);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1934);
	    assertEquals("1/2/1934", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate((-808), (-808), (-808));
	    String string0 = nextDate0.run(12, 15, 1870);
	    assertEquals("12/16/1870", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-809), (-463), (-809));
	    String string0 = nextDate0.run((-809), (-809), 2);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-809), (-463), (-809));
	    String string0 = nextDate0.run((-809), 9, (-463));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate((-809), (-463), (-809));
	    String string0 = nextDate0.run(3, 9, 1865);
	    assertEquals("3/10/1865", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 0, 1801);
	    String string0 = nextDate0.run(5, 1846, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 31, 1953);
	    assertEquals("9/1/1953", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate((-809), (-463), (-809));
	    String string0 = nextDate0.run(3, 6, 30);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1246), (-1246), (-1246));
	    String string0 = nextDate0.run(1, 4645, 4645);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 30);
	    String string0 = nextDate0.run(4, 30, 2009);
	    assertEquals("5/1/2009", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate((-809), (-463), (-809));
	    String string0 = nextDate0.run(1470, 3, 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 1, 1965);
	    String string0 = nextDate0.run(2, 30, 1965);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1974);
	    assertEquals("3/1/1974", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate((-814), (-814), (-814));
	    String string0 = nextDate0.run(12, 31, 1894);
	    assertEquals("1/1/1895", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate((-809), (-809), (-809));
	    String string0 = nextDate0.run(7, 7, 1865);
	    assertEquals("7/7/1865", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate((-809), (-463), (-809));
	    String string0 = nextDate0.run(2, 9, 1865);
	    assertEquals("2/10/1865", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate((-808), (-808), (-808));
	    String string0 = nextDate0.run(6, 31, 1878);
	    assertEquals("Invalid Input Date", string0);
	}

}