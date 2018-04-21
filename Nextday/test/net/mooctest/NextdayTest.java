/**
 * 
 */
package net.mooctest;

import static org.junit.Assert.*;

import main.java.net.mooctest.Date;
import main.java.net.mooctest.Nextday;
import org.junit.Test;

public class NextdayTest {

	@Test
	public void test() {
        Date a = new Date(4, 25, 1995);
        Date b = new Date(4, 26, 1995);
        assertEquals(b, Nextday.nextDay(a));
	}

}
