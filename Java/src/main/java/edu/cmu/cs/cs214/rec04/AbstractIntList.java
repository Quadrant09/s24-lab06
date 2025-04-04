package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;
import java.util.List;

/**
 * An abstract class for integer lists, provides base implementation.
 */
public abstract class AbstractIntList implements IntegerList {

    private List<Integer> internalList = new ArrayList<>();

    @Override
public boolean addAll(IntegerList list) {
    boolean changed = false;
    for (int i = 0; i < list.size(); i++) {
        if (this.add(list.get(i))) { // өөрийн add() true өгвөл list өөрчлөгдсөн
            changed = true;
        }
    }
    return changed;
}


    @Override
    public int get(int index) {
        return internalList.get(index);
    }

    @Override
    public int size() {
        return internalList.size();
    }

    protected boolean add(int index, int num) {
        internalList.add(index, num);
        return true;
    }

    protected boolean addToEnd(int num) {
        internalList.add(num);
        return true;
    }
}
