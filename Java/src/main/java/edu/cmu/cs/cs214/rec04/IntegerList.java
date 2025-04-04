package edu.cmu.cs.cs214.rec04;

public interface IntegerList {
    /**
     * Adds the specified value to the list in sorted order.
     * @param value the value to add
     * @return true if the list changed as a result of the call
     */
    boolean add(int value);

    /**
     * Adds all elements from the given list to this list.
     * @param list the list to add from
     * @return true if this list changed as a result of the call
     */
    boolean addAll(IntegerList list);

    /**
     * Returns the number of elements in the list.
     * @return size of the list
     */
    int size();

    /**
     * Returns the element at the specified position in this list.
     * @param index index of the element to return
     * @return the element at the specified position
     */
    int get(int index);
}
