package edu.cmu.cs.cs214.rec04;

/**
 * Main class for Recitation 5. This can be used as sandbox to experiment in.
 * @author Nora Shoemaker
 *
 */
public class Main {
    public static void main(String[] args) {

        DelegationSortedIntList list1 = new DelegationSortedIntList();
        InheritanceSortedIntList list2 = new InheritanceSortedIntList();

        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        printList(list1);
        System.out.println("Total added (delegation): " + list1.getTotalAdded());

        list2.add(3);
        list2.add(0);
        list2.addAll(list1);

        printList(list2);
        System.out.println("Total added (inheritance): " + list2.getTotalAdded());
    }

    private static void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}

