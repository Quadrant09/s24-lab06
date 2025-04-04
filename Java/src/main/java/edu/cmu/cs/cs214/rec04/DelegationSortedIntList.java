package edu.cmu.cs.cs214.rec04;

/**
 * Delegation-based implementation of a sorted integer list.
 */
public class DelegationSortedIntList implements IntegerList {

    private final SortedIntList sortedList = new SortedIntList();
    private int totalAdded = 0;

    @Override
    public boolean add(int num) {
        totalAdded++;
        return sortedList.add(num);
    }

    @Override
public boolean addAll(IntegerList list) {
    boolean changed = false;
    for (int i = 0; i < list.size(); i++) {
        if (this.add(list.get(i))) {
            changed = true;
        }
    }
    return changed;
}


    @Override
    public int get(int index) {
        return sortedList.get(index);
    }

    @Override
    public int size() {
        return sortedList.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}
