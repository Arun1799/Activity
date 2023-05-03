package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        int arr[] = new int[5];
        System.out.println("Array length before adding element: " + arr.length);
        arr[0] = 1;
        System.out.println("Array length after adding element: " + arr.length);

        System.out.println();

        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Size of arraylist before :" + list.size());
        list.add(5);
        list.add(34);
        list.add(48);
        list.add(45);
        System.out.println("Size of arraylist after :" + list.size());
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println("Size of arraylist after :" + list.size());

        System.out.println("Printing using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("Printing using for-each loop:");
        for (Integer r : list) {
            System.out.println(r + " ");
        }
        System.out.println();

        System.out.println("using while loop:");
        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }
        System.out.println();

        System.out.println("Iterate using iterator:");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

        // sort arraylist ascending order
        Collections.sort(list);
        System.out.println("After sorting the values in ascending order:");
        System.out.println(list);

        // sort arraylist descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After sorting the values in descending order:");
        System.out.println(list);

        list.add(1, 100); // adding 100 element in index 1
        System.out.println(list);

        // copy array list
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println(list1);
        list1.addAll(list);
        System.out.println("Copied arraylist: " + list1);

        System.out.println(list.subList(1, 3));

    }
}
