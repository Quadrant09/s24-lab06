package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the DelegationSortedIntList class.
 *
 * @author Nora Shoemaker
 *
 */
public class DelegationSortedIntListTest {

    /** 
     * Uncomment the following code to test your implementation 
     * Select all and (CTRL + /) or (COMMAND + /)
     * Feel free to write more tests for your implementation. */

    private DelegationSortedIntList list1;
    private DelegationSortedIntList list2;

    // /**
    //  * Called before each test.
    //  */
    @Before
    public void setUp() {
    list1 = new DelegationSortedIntList();
    list2 = new DelegationSortedIntList();
    }

    /**
     * Tests for the add() method.
     */
    @Test
    public void testAdd() {
    // add 5 elements to our list.
    list1.add(1);
    list1.add(3);
    list1.add(2);
    list1.add(4);
    list1.add(2);
    // check that the total number of elements added is 5.
    assertTrue(list1.getTotalAdded() == 5);
    // helper function that prints out the contents of an IntegerList
    printList(list1);
    }

    /**
     * Test for the addAll() method.
     */
    @Test
    public void testAddAll() {
    // add 5 elements to our first list.
    list1.add(1);
    list1.add(3);
    list1.add(2);
    list1.add(4);
    list1.add(2);

    // check that the total number of elements added is 5.
    assertTrue(list1.getTotalAdded() == 5);

    // add 2 elements to a second list.
    list2.add(3);
    list2.add(0);

    // check that the total number of elements added is 2.
    assertTrue(list2.getTotalAdded() == 2);

    // add the first list (5 elements) to our second list (2 elements).
    list2.addAll(list1);

    // check that the total number of elements added to our second list is 7.
    assertTrue(list2.getTotalAdded() == 7);
    }

    /**
     * A helper function that prints out the contents of an IntegerList.
     * @param list IntegerList to be printed out.
     */
    private void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}