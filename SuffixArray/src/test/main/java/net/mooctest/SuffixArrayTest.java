package main.java.net.mooctest;

import org.junit.Test;

import static org.junit.Assert.fail;

public class SuffixArrayTest {

    private int[] intArray2;

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        int[] intArray0 = new int[4];
        String string0 = "@?Z{";
        int[] intArray1 = new int[3];
        int int0 = 249;
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray1);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[1] = 114;
        intArray0[2] = 1764;
        intArray0[3] = 413;
        SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray0);
        int[] intArray1 = new int[9];
        int int0 = 1;
        intArray1[0] = 0;
        intArray0[2] = 1;
        intArray1[2] = 413;
        intArray1[3] = 114;
        intArray1[4] = 413;
        intArray1[5] = 114;
        intArray1[6] = 1764;
        intArray1[7] = 1764;
        intArray1[8] = 1764;
        SuffixArray.sleq(intArray0, 1, intArray1, 0);
        SuffixArray.makeLCPArray(intArray1, intArray0, intArray1);
        // Undeclared exception!
        try {
            SuffixArray.makeSuffixArray(intArray0, intArray0, 1, (-1));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1
            //

        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        int[] intArray0 = new int[8];
        SuffixArray.isSorted(intArray0, intArray0, 0);
        int int0 = 6;
        SuffixArray.isPermutation(intArray0, 6);
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArraySlow("", intArray0, intArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[1] = 114;
        intArray0[2] = 1764;
        intArray0[3] = 413;
        SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray0);
        int[] intArray1 = new int[9];
        intArray1[0] = 1;
        intArray0[2] = 1;
        intArray1[2] = 413;
        intArray1[3] = 114;
        intArray1[4] = 413;
        intArray1[5] = 114;
        intArray1[6] = 1764;
        intArray1[7] = 1764;
        intArray1[8] = 1764;
        SuffixArray.sleq(intArray0, 1, intArray1, 0);
        SuffixArray.makeLCPArray(intArray1, intArray0, intArray1);
        SuffixArray.makeSuffixArray(intArray0, intArray0, 0, (-1));
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[2] = 1764;
        intArray0[3] = 413;
        SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray0);
        int[] intArray1 = new int[9];
        intArray1[0] = 1;
        intArray1[2] = 413;
        intArray1[4] = 413;
        intArray1[6] = 1764;
        intArray1[8] = 1764;
        SuffixArray.sleq(intArray0, 1, intArray1, 0);
        int[] intArray2 = new int[8];
        intArray2[0] = 1;
        intArray2[1] = 2822;
        intArray2[2] = 413;
        intArray2[3] = 1;
        intArray2[4] = 1764;
        intArray2[5] = 1764;
        intArray2[6] = 1;
        intArray2[7] = 1764;
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray2);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        int int0 = 1;
        // Undeclared exception!
        try {
            SuffixArray.makeSuffixArray((int[]) null, (int[]) null, 1, 1);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        int[] intArray0 = new int[7];
        intArray0[0] = 0;
        intArray0[1] = 1;
        intArray0[2] = (-1557);
        intArray0[3] = (-2339);
        intArray0[4] = (-1366);
        intArray0[5] = 1;
        intArray0[6] = 0;
        SuffixArray.isPermutation(intArray0, 0);
        SuffixArray.isSorted(intArray0, intArray0, 0);
        // Undeclared exception!
        try {
            SuffixArray.isSorted(intArray0, intArray0, 608);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -1557
            //

        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        int[] intArray0 = null;
        int int0 = 907;
        // Undeclared exception!
        try {
            SuffixArray.isSorted((int[]) null, (int[]) null, 907);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[2] = 1764;
        intArray0[3] = 413;
        SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray0);
        int[] intArray1 = new int[9];
        intArray1[0] = 1;
        intArray1[1] = 1;
        intArray1[2] = 413;
        intArray1[4] = 413;
        intArray1[6] = 1764;
        intArray1[7] = 1764;
        intArray1[8] = 1764;
        SuffixArray.sleq(intArray0, 1, intArray1, 1);
        // Undeclared exception!
        try {
            SuffixArray.makeLCPArray(intArray1, intArray0, intArray1);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 9
            //

        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        String string0 = "";
        int[] intArray0 = new int[0];
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArraySlow("", intArray0, intArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //

        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        int[] intArray0 = new int[4];
        int int0 = (-1);
        intArray0[0] = (-1);
        intArray0[1] = 2;
        intArray0[2] = (-1202);
        int int1 = 1543;
        intArray0[1] = 1543;
        SuffixArray.createSuffixArray("!ou", intArray0, intArray0);
        // Undeclared exception!
        try {
            SuffixArray.makeSuffixArray(intArray0, intArray0, 256, (-4636));
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        int[] intArray0 = new int[0];
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArraySlow("", intArray0, intArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //

        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        int[] intArray0 = new int[6];
        intArray0[0] = 1288;
        intArray0[1] = 0;
        intArray0[2] = 1041;
        intArray0[3] = (-1);
        intArray0[4] = 256;
        intArray0[5] = 0;
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArray("JmRx", intArray0, intArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 256
            //

        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        SuffixArray.computeLCP("X", "");
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        int[] intArray0 = new int[2];
        int int0 = (-2183);
        intArray0[0] = (-2183);
        int int1 = 256;
        intArray0[1] = 256;
        String string0 = "";
        SuffixArray.printV(intArray0, "");
        int int2 = 0;
        int int3 = 2679;
        // Undeclared exception!
        SuffixArray.makeSuffixArray(intArray0, intArray0, 0, 2679);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 0;
        intArray0[1] = 0;
        intArray0[2] = 0;
        intArray0[3] = 0;
        intArray0[4] = 196;
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArray((String) null, intArray0, intArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        int[] intArray0 = null;
        int int0 = 0;
        // Undeclared exception!
        try {
            SuffixArray.sleq((int[]) null, 123, (int[]) null, 0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        int[] intArray0 = new int[8];
        intArray0[0] = 0;
        intArray0[1] = (-1664);
        int int0 = 2523;
        intArray0[2] = 2523;
        intArray0[3] = 1170;
        int int1 = (-1);
        intArray0[4] = (-1);
        intArray0[5] = 2513;
        intArray0[6] = 0;
        intArray0[7] = 0;
        String string0 = "mcZ^";
        SuffixArray.printV(intArray0, "mcZ^");
        // Undeclared exception!
        try {
            SuffixArray.makeSuffixArray(intArray0, intArray0, 2403, 2);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1171
            //

        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        int[] intArray0 = null;
        // Undeclared exception!
        try {
            SuffixArray.isPermutation((int[]) null, 1028);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SuffixArray.computeLCP("vjpxJ+o<l=o^", " ");
        SuffixArray suffixArray0 = new SuffixArray();
        int[] intArray0 = new int[2];
        intArray0[0] = 0;
        intArray0[1] = 0;
        SuffixArray.isPermutation(intArray0, 0);
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArray("", intArray0, intArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 3
            //

        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        int[] intArray0 = new int[0];
        SuffixArray.createSuffixArray("", intArray0, intArray0);
        int int0 = 3;
        // Undeclared exception!
        try {
            SuffixArray.isPermutation(intArray0, 3);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //

        }
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 335;
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArray("main.java.net.mooctest.SuffixArray", intArray0, intArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1
            //

        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        SuffixArray suffixArray0 = new SuffixArray();
        int[] intArray0 = new int[5];
        intArray0[0] = 266;
        intArray0[1] = 0;
        intArray0[2] = 1723;
        intArray0[3] = (-1);
        intArray0[4] = (-1924);
        SuffixArray.isSorted(intArray0, intArray0, 1);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 0;
        intArray0[1] = 1496;
        intArray0[2] = (-1);
        intArray0[3] = 0;
        SuffixArray.makeSuffixArray(intArray0, intArray0, (-1), 0);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = (-1439);
        intArray0[1] = 0;
        SuffixArray.isSorted(intArray0, intArray0, (-1439));
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArray("", intArray0, intArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -1439
            //

        }
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        int[] intArray0 = new int[2];
        int int0 = 2665;
        intArray0[0] = 2665;
        int int1 = 0;
        intArray0[1] = 0;
        // Undeclared exception!
        try {
            SuffixArray.isPermutation(intArray0, 2665);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 2665
            //

        }
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        String string0 = "";
        SuffixArray.computeLCP("", "");
        int[] intArray0 = new int[4];
        intArray0[0] = 0;
        intArray0[1] = 0;
        intArray0[2] = 0;
        intArray0[3] = 0;
        SuffixArray.isSorted(intArray0, intArray0, 0);
        String string1 = null;
        // Undeclared exception!
        try {
            SuffixArray.computeLCP("l)Z%jV8U8M9*7F\"},", (String) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        int[] intArray0 = null;
        // Undeclared exception!
        try {
            SuffixArray.makeLCPArray((int[]) null, (int[]) null, (int[]) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        int[] intArray0 = new int[0];
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArraySlow((String) null, intArray0, intArray0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        int[] intArray0 = new int[7];
        intArray0[0] = (-1);
        intArray0[1] = 2330;
        intArray0[2] = (-1);
        intArray0[3] = (-2330);
        intArray0[4] = 1703;
        intArray0[5] = 0;
        intArray0[6] = (-538);
        SuffixArray.printV(intArray0, "");
        SuffixArray.isSorted(intArray0, intArray0, (-538));
        SuffixArray suffixArray0 = new SuffixArray();
        // Undeclared exception!
        try {
            SuffixArray.isPermutation(intArray0, (-2330));
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        SuffixArray.computeLCP("main.java.net.mooctest.SuffixArray", "main.java.net.mooctest.SuffixArray");
        // Undeclared exception!
        try {
            SuffixArray.printV((int[]) null, "main.java.net.mooctest.SuffixArray");
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        int[] intArray0 = new int[0];
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArraySlow("S\"-']<\"VK|b", intArray0, intArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 0;
        SuffixArray.printV(intArray0, "");
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        SuffixArray.computeLCP("0VJ", "0VJ");
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        int[] intArray0 = new int[0];
        SuffixArray.printV(intArray0, "S\"y");
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        int[] intArray0 = new int[7];
        intArray0[0] = 0;
        intArray0[1] = 1;
        intArray0[3] = (-2339);
        intArray0[4] = (-1366);
        intArray0[5] = 1;
        intArray0[6] = 0;
        SuffixArray.isPermutation(intArray0, 0);
        SuffixArray.isSorted(intArray0, intArray0, 573);
        // Undeclared exception!
        try {
            SuffixArray.sleq(intArray0, 0, intArray0, (-1366));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -1366
            //

        }
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        String string0 = "x4qg?|C1rL4qh7nY";
        int[] intArray0 = new int[1];
        int int0 = 3;
        intArray0[0] = 3;
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArray("x4qg?|C1rL4qh7nY", intArray0, intArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1
            //

        }
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        int[] intArray0 = new int[8];
        intArray0[1] = 2;
        intArray0[4] = (-1084);
        intArray0[4] = (-2088);
        intArray0[5] = 2;
        intArray0[6] = (-1622);
        intArray0[7] = (-1647);
        SuffixArray.isSorted(intArray0, intArray0, 2);
        // Undeclared exception!
        try {
            SuffixArray.isPermutation(intArray0, (-2906));
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        SuffixArray.computeLCP("", "");
        int[] intArray0 = new int[3];
        intArray0[0] = 0;
        intArray0[1] = 0;
        intArray0[2] = 0;
        // Undeclared exception!
        try {
            SuffixArray.isSorted(intArray0, intArray0, 6461);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 3
            //

        }
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 0;
        intArray0[1] = 1;
        SuffixArray.sleq(intArray0, 1, intArray0, 0);
        // Undeclared exception!
        try {
            SuffixArray.sleq(intArray0, (-232), intArray0, 0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -232
            //

        }
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 3;
        intArray0[1] = 0;
        // Undeclared exception!
        try {
            SuffixArray.sleq(intArray0, 0, intArray0, 0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 2
            //

        }
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        int[] intArray0 = new int[9];
        intArray0[3] = 1;
        SuffixArray.isPermutation(intArray0, 1);
        int[] intArray1 = new int[2];
        intArray1[0] = 245;
        intArray1[1] = (-174);
        SuffixArray.sleq(intArray0, 0, intArray1, 0);
        SuffixArray.isSorted(intArray0, intArray1, 0);
        SuffixArray.sleq(intArray1, 1, intArray0, 0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        // Undeclared exception!
        try {
            SuffixArray.sleq((int[]) null, (-3342), (int[]) null, (-3342));
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = (-444);
        SuffixArray.isPermutation(intArray0, 0);
        SuffixArray suffixArray0 = new SuffixArray();
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        String string0 = "vZVNhe";
        String string1 = "";
        String string2 = "";
        SuffixArray.computeLCP("vZVNhe", "");
        int[] intArray0 = new int[4];
        intArray0[0] = 7;
        SuffixArray.printV(intArray0, "");
        // Undeclared exception!
        try {
            SuffixArray.sleq(intArray0, 0, intArray0, (-1565));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -1565
            //

        }
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[1] = 2;
        SuffixArray.createSuffixArray("!ou", intArray0, intArray0);
        // Undeclared exception!
        try {
            SuffixArray.makeSuffixArray(intArray0, intArray0, 256, 0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 4
            //

        }
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        int[] intArray0 = new int[9];
        SuffixArray.isPermutation(intArray0, 0);
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArraySlow("cxPs^.JfYWbp:x", intArray0, intArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        int[] intArray0 = new int[8];
        intArray0[1] = 2;
        intArray0[4] = (-1112);
        intArray0[5] = 2;
        intArray0[7] = 307;
        SuffixArray.isSorted(intArray0, intArray0, 2);
        // Undeclared exception!
        try {
            SuffixArray.isPermutation(intArray0, (-2906));
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        int[] intArray0 = new int[8];
        intArray0[1] = 2;
        intArray0[2] = 2;
        intArray0[7] = (-1647);
        SuffixArray.isSorted(intArray0, intArray0, 2);
        SuffixArray.isPermutation(intArray0, 3);
        // Undeclared exception!
        try {
            SuffixArray.isPermutation(intArray0, (-1647));
            fail("Expecting exception: NegativeArraySizeException");

        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        String string0 = "main.jav.net.moocteQt.SuffixArray";
        int[] intArray0 = new int[4];
        intArray0[2] = 0;
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArray("main.jav.net.moocteQt.SuffixArray", intArray0, intArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 4
            //

        }
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        int[] intArray0 = new int[4];
        String string0 = "@?Z{";
        int[] intArray1 = new int[9];
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray1);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[1] = 114;
        SuffixArray.createSuffixArraySlow("@?Z{", intArray0, intArray0);
        int[] intArray1 = new int[9];
        intArray1[0] = 0;
        intArray0[2] = 1;
        intArray1[2] = 413;
        intArray1[4] = 413;
        intArray1[5] = 114;
        intArray1[6] = 0;
        intArray1[7] = 1;
        intArray1[8] = 0;
        SuffixArray.sleq(intArray0, 1, intArray1, 0);
        SuffixArray.makeLCPArray(intArray1, intArray0, intArray1);
        SuffixArray.computeLCP("R~ISM?", "R~ISM?");
        SuffixArray.makeSuffixArray(intArray0, intArray1, (-1), 1295);
        int[] intArray2 = new int[1];
        intArray2[0] = 1;
        // Undeclared exception!
        try {
            SuffixArray.sleq(intArray0, (-1), intArray2, (-400));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // -1
            //

        }
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        String string0 = "x4qg?|C1rL4qh7nY";
        int[] intArray0 = new int[1];
        // Undeclared exception!
        try {
            SuffixArray.createSuffixArray("x4qg?|C1rL4qh7nY", intArray0, intArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 1
            //
        }
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 0;
        intArray0[1] = 1500;
        intArray0[2] = (-1);
        intArray0[3] = 0;
        int[] intArray1 = new int[5];
        intArray1[0] = 1;
        intArray1[1] = 2000;
        intArray1[2] = (-20);
        intArray1[3] = 4;
        intArray1[4] = 55;
        SuffixArray.makeSuffixArray(intArray0, intArray1, (-1), 15);
    }

}
