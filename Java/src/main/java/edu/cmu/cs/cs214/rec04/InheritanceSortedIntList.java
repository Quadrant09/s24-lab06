package edu.cmu.cs.cs214.rec04;

/**
 * Inheritance-based implementation of a sorted integer list.
 */
public class InheritanceSortedIntList extends SortedIntList {

    private int totalAdded = 0;

    @Override
    public boolean add(int num) {
        totalAdded++;
        return super.add(num);
    }

    @Override
public boolean addAll(IntegerList list) {
    boolean changed = false;
    for (int i = 0; i < list.size(); i++) {
        boolean added = this.add(list.get(i)); // add() нь true/false буцаана
        if (added) changed = true;
    }
    return changed;
}


    public int getTotalAdded() {
        return totalAdded;
    }
}
