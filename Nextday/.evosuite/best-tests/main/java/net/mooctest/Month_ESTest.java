/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 24 13:27:05 GMT 2018
 */

package main.java.net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import main.java.net.mooctest.Month;
import main.java.net.mooctest.Year;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Month_ESTest extends Month_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Year year0 = new Year(9);
      Month month0 = new Month(9, year0);
      Month month1 = new Month(9, year0);
      month1.increment();
      boolean boolean0 = month0.equals(month1);
      assertEquals(10, month1.getMonth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Year year0 = new Year(11);
      Month month0 = new Month(11, year0);
      boolean boolean0 = month0.increment();
      assertEquals(12, month0.getMonth());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Year year0 = new Year(1);
      Month month0 = new Month(1, year0);
      month0.currentPos = 0;
      int int0 = month0.getMonth();
      assertFalse(month0.isValid());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Year year0 = new Year(4);
      Month month0 = new Month(4, year0);
      month0.setCurrentPos((-627));
      int int0 = month0.getMonth();
      assertEquals((-627), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Year year0 = new Year(1);
      Month month0 = new Month(1, year0);
      month0.currentPos = 0;
      // Undeclared exception!
      try { 
        month0.getMonthSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("main.java.net.mooctest.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Year year0 = new Year(1);
      Month month0 = new Month(1, year0);
      month0.isValid();
      assertEquals(31, month0.getMonthSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Year year0 = new Year(4);
      Month month0 = new Month(4, year0);
      month0.setCurrentPos((-627));
      boolean boolean0 = month0.isValid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Year year0 = new Year(1);
      Month month0 = new Month(1, year0);
      assertEquals(1, month0.getMonth());
      
      month0.setMonth(4, year0);
      assertEquals(30, month0.getMonthSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Year year0 = new Year(11);
      Month month0 = new Month(11, year0);
      year0.setCurrentPos(0);
      // Undeclared exception!
      try { 
        month0.setMonth(11, year0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not a valid month
         //
         verifyException("main.java.net.mooctest.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Year year0 = new Year(9);
      Month month0 = new Month(9, year0);
      Year year1 = new Year((-125));
      Month month1 = new Month(9, year1);
      boolean boolean0 = month0.equals(month1);
      assertFalse(boolean0);
      assertEquals(30, month1.getMonthSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Year year0 = new Year(1);
      Month month0 = new Month(1, year0);
      month0.increment();
      Month month1 = new Month(1, year0);
      boolean boolean0 = month0.equals(month1);
      assertEquals(2, month0.getMonth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Year year0 = new Year(1);
      Month month0 = new Month(1, year0);
      boolean boolean0 = month0.equals(month0);
      assertEquals(31, month0.getMonthSize());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Year year0 = new Year(4);
      Month month0 = new Month(4, year0);
      month0.equals(year0);
      assertEquals(30, month0.getMonthSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Year year0 = new Year(7);
      Month month0 = new Month(7, year0);
      month0.currentPos = 29;
      boolean boolean0 = month0.isValid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Year year0 = new Year(12);
      Month month0 = null;
      try {
        month0 = new Month((-428), year0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not a valid month
         //
         verifyException("main.java.net.mooctest.Month", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Year year0 = new Year(4);
      Month month0 = new Month(4, year0);
      year0.setCurrentPos(0);
      boolean boolean0 = month0.isValid();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Year year0 = new Year(7);
      Month month0 = new Month(7, year0);
      month0.currentPos = 29;
      boolean boolean0 = month0.increment();
      assertEquals(30, month0.getMonth());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Year year0 = new Year(12);
      Month month0 = new Month(12, year0);
      month0.currentPos = (-2097);
      boolean boolean0 = month0.increment();
      assertEquals((-2096), month0.getMonth());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Year year0 = new Year(4);
      Month month0 = new Month(4, year0);
      int int0 = month0.getMonthSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Year year0 = new Year(1);
      Month month0 = new Month(1, year0);
      int int0 = month0.getMonth();
      assertEquals(31, month0.getMonthSize());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Month month0 = null;
      try {
        month0 = new Month((-982), (Year) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Not a valid month
         //
         verifyException("main.java.net.mooctest.Month", e);
      }
  }
}
