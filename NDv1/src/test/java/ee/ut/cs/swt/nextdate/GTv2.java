package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 31, 2017);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 1, 2021);
	    String string0 = nextDate0.run(6, 2, 2021);
	    assertEquals("6/3/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1973);
	    assertEquals("3/4/1973", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, (-964), (-964));
	    String string0 = nextDate0.run(5, 5, 1880);
	    assertEquals("5/6/1880", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 29, 1995);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, (-964), (-964));
	    String string0 = nextDate0.run(1, 5, 1880);
	    assertEquals("1/6/1880", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(559, (-199), 1026);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-817), (-817), 12);
	    String string0 = nextDate0.run((-2922), 1279, 1);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 1, 2021);
	    String string0 = nextDate0.run(11, 30, 2021);
	    assertEquals("12/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 2021);
	    assertEquals("9/10/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(8, 31, 1986);
	    assertEquals("9/1/1986", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 1801);
	    assertEquals("11/12/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, (-964), (-964));
	    String string0 = nextDate0.run(5, 2110, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 2019);
	    assertEquals("10/11/2019", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate19() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, (-964), (-964));
	    String string0 = nextDate0.run(4, 156, 2808);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1995);
	    assertEquals("3/1/1995", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 31, 1995);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 1, 2021);
	    String string0 = nextDate0.run(2, 2, 2021);
	    assertEquals("2/3/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1992);
	    assertEquals("2/29/1992", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 2019);
	    assertEquals("7/7/2019", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate((-817), (-817), 12);
	    String string0 = nextDate0.run(12, 28, 1866);
	    assertEquals("12/29/1866", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 1947);
	    assertEquals("1/1/1948", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 29, 29);
	    String string0 = nextDate0.run(2, 29, 2000);
	    assertEquals("3/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 29, 29);
	    String string0 = nextDate0.run(2, 29, 2000);
	    assertEquals("3/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate21() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(28, 639, 639);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate20() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, (-964), (-964));
	    String string0 = nextDate0.run(1, 30, 1);
	    assertEquals("invalid Input Date", string0);
	}

}