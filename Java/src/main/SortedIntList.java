package edu.cmu.cs.cs214.rec04;

public class SortedIntList extends AbstractIntList {

    /**
     * Adds the specified number to the list, maintaining sorted order.
     *
     * @param num the number to add
     * @return true if added successfully
     */
    @Override
    public boolean add(int num) {
        int index = 0;
        while (index < size() && get(index) < num) {
            index++;
        }
        super.add(index, num);
        return true;
    }

    /**
     * Override add(index, num) to disallow inserting at a specific index.
     * The list must remain sorted.
     */
    @Override
    public void add(int index, int num) {
        add(num); // Ignore index to preserve sorting
    }
}

