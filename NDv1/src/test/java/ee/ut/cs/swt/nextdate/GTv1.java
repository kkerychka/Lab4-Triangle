package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1817, 1817, 1817);
	    String string0 = nextDate0.run(5, 5, 1817);
	    assertEquals("5/6/1817", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(8, 8, 1801);
	    assertEquals("8/9/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 30, 2016);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 1, 31);
	    String string0 = nextDate0.run(1, 31, 1809);
	    assertEquals("2/1/1809", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1802, 1802, 1802);
	    String string0 = nextDate0.run(2, 2, 1802);
	    assertEquals("2/3/1802", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1806);
	    assertEquals("3/1/1806", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-739), (-739), (-739));
	    String string0 = nextDate0.run(11, (-1794), 11);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1275, 1, 1275);
	    String string0 = nextDate0.run(1, 4, 3475);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(8, 1801, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(1828, 1828, 1828);
	    String string0 = nextDate0.run(1828, 6, 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(12, 12, 12);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(12, 12, 1801);
	    assertEquals("12/13/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(2, 29, 2021);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1833, 1833, 1833);
	    String string0 = nextDate0.run(7, 7, 1833);
	    assertEquals("7/7/1833", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1828, 1828, 1828);
	    String string0 = nextDate0.run(6, 6, 1828);
	    assertEquals("6/7/1828", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 31, 1962);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 30, 2016);
	    assertEquals("12/1/2016", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(10, 10, 1933);
	    assertEquals("10/11/1933", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate((-739), (-739), (-739));
	    String string0 = nextDate0.run(3, 31, 1858);
	    assertEquals("4/1/1858", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate((-739), (-739), (-739));
	    String string0 = nextDate0.run(12, 31, 1804);
	    assertEquals("12/32/1804", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate((-739), (-739), (-739));
	    String string0 = nextDate0.run(12, 31, 1804);
	    assertEquals("12/32/1804", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run((-3365), 1397, (-1));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-739), (-739), (-739));
	    String string0 = nextDate0.run(3, 1, 1858);
	    assertEquals("3/2/1858", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-739), (-437), (-437));
	    String string0 = nextDate0.run(11, 21, 1855);
	    assertEquals("11/22/1855", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1826, 1826, 1826);
	    String string0 = nextDate0.run(9, 9, 1826);
	    assertEquals("9/10/1826", string0);
	}

}