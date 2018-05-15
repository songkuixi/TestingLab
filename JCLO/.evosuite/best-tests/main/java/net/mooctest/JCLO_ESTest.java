/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 25 01:56:59 GMT 2018
 */

package main.java.net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import main.java.net.mooctest.JCLO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JCLO_ESTest extends JCLO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[][] stringArray0 = new String[9][8];
      String[] stringArray1 = new String[8];
      stringArray1[0] = "0{cI#ZjwwG[g";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray0[1];
      String[] stringArray2 = new String[6];
      stringArray2[0] = "-`6N!HA[=LY:&J22_6N!HA[";
      stringArray0[3] = stringArray2;
      stringArray0[4] = stringArray1;
      stringArray0[5] = stringArray0[0];
      stringArray0[6] = stringArray1;
      stringArray0[7] = stringArray0[6];
      String[] stringArray3 = new String[0];
      stringArray0[8] = stringArray3;
      JCLO jCLO0 = new JCLO("0{cI#ZjwwG[g", "0{cI#ZjwwG[g", stringArray0);
      // Undeclared exception!
      try { 
        jCLO0.parse(stringArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("main.java.net.mooctest.JCLO", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[][] stringArray0 = new String[6][9];
      JCLO jCLO0 = null;
      try {
        jCLO0 = new JCLO((String) null, (Object) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.net.mooctest.JCLO", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JCLO jCLO0 = null;
      try {
        jCLO0 = new JCLO((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.net.mooctest.JCLO", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[][] stringArray0 = new String[8][0];
      JCLO jCLO0 = null;
      try {
        jCLO0 = new JCLO((Object) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.net.mooctest.JCLO", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JCLO jCLO0 = null;
      try {
        jCLO0 = new JCLO((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("main.java.net.mooctest.JCLO", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JCLO jCLO0 = new JCLO("-mXQ96=6666");
      jCLO0.parse(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[][] stringArray0 = new String[3][2];
      String[] stringArray1 = new String[2];
      stringArray1[0] = "-z";
      String[] stringArray2 = new String[2];
      stringArray2[0] = "";
      stringArray0[0] = stringArray2;
      JCLO jCLO0 = new JCLO((Object) "-x", stringArray0);
      // Undeclared exception!
      try { 
        jCLO0.parse(stringArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[][] stringArray0 = new String[3][2];
      String[] stringArray1 = new String[2];
      stringArray1[0] = "-z";
      stringArray0[1] = stringArray1;
      stringArray0[0] = stringArray1;
      stringArray0[2] = stringArray1;
      JCLO jCLO0 = new JCLO((Object) "-x", stringArray0);
      // Undeclared exception!
      try { 
        jCLO0.parse(stringArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such option: \"\"
         //
         verifyException("main.java.net.mooctest.JCLO", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-mXQ96=6";
      JCLO jCLO0 = new JCLO("-mXQ96=6666");
      // Undeclared exception!
      try { 
        jCLO0.parse(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such option: \"XQ96\"
         //
         verifyException("main.java.net.mooctest.JCLO", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JCLO jCLO0 = new JCLO("t", "t");
      String string0 = jCLO0.usage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JCLO jCLO0 = new JCLO("", "");
      String string0 = jCLO0.usage();
      assertEquals("-hash int\n", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      JCLO jCLO0 = new JCLO(",H)rLFwow", object0);
      String string0 = jCLO0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      String[] stringArray0 = new String[1];
      stringArray0[0] = ",H)rLFwow";
      JCLO jCLO0 = new JCLO(",H)rLFwow", object0);
      jCLO0.parse(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JCLO jCLO0 = new JCLO("<;39k:=Wuwo=mJq");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-`CASE_INSENSITIVE_ORDER";
      // Undeclared exception!
      try { 
        jCLO0.parse(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // '-`CASE_INSENSITIVE_ORDER' requires '=VALUE'
         //
         verifyException("main.java.net.mooctest.JCLO", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[][] stringArray0 = new String[3][2];
      JCLO jCLO0 = new JCLO((Object) "-x", stringArray0);
      String string0 = jCLO0.usage();
      assertEquals("-hash int\n", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JCLO jCLO0 = new JCLO("", "");
      // Undeclared exception!
      try { 
        jCLO0.toString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [C cannot be cast to [Ljava.lang.Object;
         //
         verifyException("main.java.net.mooctest.JCLO", e);
      }
  }
}