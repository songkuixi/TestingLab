package main.java.net.mooctest;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class NodeTest {

    @Test
    public void test00() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        leafNode0.insert(1726, "sdY PU&");
        leafNode0.insert(1, "");
        leafNode0.insert(3, "");
        InsertionResult<String> insertionResult0 = leafNode0.insert(1339, "xz<");
        assertEquals(387, insertionResult0.getMinGap());
    }

    @Test
    public void test01() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        leafNode0.insert(1726, "sdY PU&");
        leafNode0.insert(1225, "");
        leafNode0.insert(1665, "main.java.net.mooctest.LeafNode");
        leafNode0.insert(2, "sdY PU&");
        leafNode0.insert(1726, "sdY PU&");
        assertEquals(4, leafNode0.getNodeSize());
    }

    @Test
    public void test02() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        leafNode0.insert(1665, "main.java.net.mooctest.LeafNode");
        leafNode0.insert(1726, "sdY PU&");
        leafNode0.insert(0, "main.java.net.mooctest.Node");
        int int0 = leafNode0.findLessThanOrEqualToKey(1665);
        assertEquals(1, int0);
    }

    @Test
    public void test03() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        leafNode0.insert(1726, "sdY PU&");
        int int0 = leafNode0.order(1726);
        assertEquals(0, int0);
    }

    @Test
    public void test04() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        leafNode0.insert(1726, "sdY PU&");
        leafNode0.insert(1, "");
        int int0 = leafNode0.order(1726);
        assertEquals(1, int0);
    }

    @Test
    public void test05() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        int int0 = leafNode0.order((-768));
        assertEquals((-1), int0);
    }

    @Test
    public void test06() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        leafNode0.insert(1726, "main.java.net.mooctest.LeafNode");
        leafNode0.insert(1726, "sdY PU&");
        assertEquals(1, leafNode0.getNodeSize());
    }

    @Test
    public void test07() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        LeafNode<String> leafNode1 = new LeafNode<String>(1726, leafNode0);
        leafNode1.insert(1726, "sdY PU&");
        InsertionResult<String> insertionResult0 = leafNode0.insert(1665, "main.java.net.mooctest.LeafNode");
        InsertionResult<String> insertionResult1 = leafNode0.insert(1726, "sdY PU&");
        assertFalse(insertionResult1.equals((Object) insertionResult0));
    }

    @Test
    public void test08() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1776);
        leafNode0.insert((-1), "sd gPU");
        InsertionResult<String> insertionResult0 = leafNode0.insert(Integer.MAX_VALUE, "sd gPU");
        assertNull(insertionResult0.getSplitRootKey());
    }

    @Test
    public void test09() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1776);
        leafNode0.insert(1776, "sd gPU");
        int int0 = leafNode0.getNodeSize();
        assertEquals(1, int0);
    }

    @Test
    public void test10() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        leafNode0.insert(1726, "sdY PU&");
        int int0 = leafNode0.findLessThanOrEqualToKey(0);
        assertEquals(0, int0);
    }

    @Test
    public void test11() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        int int0 = leafNode0.findLessThanOrEqualToKey(1726);
        assertEquals((-1), int0);
    }

    @Test
    public void test12() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2);
        leafNode0.keys = null;
        // Undeclared exception!
        try {
            leafNode0.order(2);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test
    public void test13() throws Throwable {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        Integer integer0 = new Integer(2344);
        linkedList0.add(integer0);
        LinkedList<Node<Object>> linkedList1 = new LinkedList<Node<Object>>();
        InternalNode<Object> internalNode0 = new InternalNode<Object>(2344, linkedList0, linkedList1);
        // Undeclared exception!
        try {
            internalNode0.order((-3297));
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //

        }
    }

    @Test
    public void test14() throws Throwable {
        InternalNode<Integer> internalNode0 = new InternalNode<Integer>(1285);
        // Undeclared exception!
        try {
            internalNode0.order(3);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test15() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1746);
        leafNode0.keys = null;
        // Undeclared exception!
        try {
            leafNode0.insert(1, "[tW;Qsu:* 3");
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test
    public void test16() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        LeafNode<String> leafNode1 = new LeafNode<String>(1726, leafNode0);
        leafNode0.insert(0, "sdY PU&");
        // Undeclared exception!
        try {
            leafNode0.insert(1726, "sdY PU&");
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
            //

        }
    }

    @Test
    public void test17() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1726);
        leafNode0.t = 1726;
        leafNode0.t = (-1965);
        // Undeclared exception!
        try {
            leafNode0.insert(1, "");
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // Illegal Capacity: -1966
            //

        }
    }

    @Test
    public void test18() throws Throwable {
        InternalNode<String> internalNode0 = new InternalNode<String>(275);
        // Undeclared exception!
        try {
            internalNode0.insert(0, "NPPtkK[%");
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test
    public void test19() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2);
        LeafNode<Object> leafNode1 = new LeafNode<Object>(2, leafNode0);
        LeafNode<Object> leafNode2 = leafNode0.getNext();
        leafNode2.keys = null;
        // Undeclared exception!
        try {
            leafNode2.getNodeSize();
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test
    public void test20() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(2);
        leafNode0.keys = null;
        // Undeclared exception!
        try {
            leafNode0.findLessThanOrEqualToKey(2);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //

        }
    }

    @Test
    public void test21() throws Throwable {
        LeafNode<String> leafNode0 = new LeafNode<String>(1776);
        leafNode0.insert(1776, "sd gPU");
        leafNode0.insert((-29), "sd gPU");
        InsertionResult<String> insertionResult0 = leafNode0.insert(1312, "sd gPU");
        assertEquals(464, insertionResult0.getMinGap());

        InsertionResult<String> insertionResult1 = leafNode0.insert((-14), "sd gPU");
        assertEquals(15, insertionResult1.getMinGap());
    }

    @Test
    public void test22() throws Throwable {
        LeafNode<Object> leafNode0 = new LeafNode<Object>(2);
        int int0 = leafNode0.getNodeSize();
        assertEquals(0, int0);
    }
}