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

    // @Override
    // public boolean addAll(IntegerList list) {
    //     // int initialSize = size();
        
    //    return super.addAll(list);
        
    //     // return size() != initialSize;
    // }


    public int getTotalAdded() {
        return totalAdded;
    }
}
