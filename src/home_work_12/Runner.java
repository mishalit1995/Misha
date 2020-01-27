package home_work_12;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {

        List<Integer> list = new List<>(
                new Integer[] {1, 5, 10, 45, 16, 46});

        list.addFirst(2);
        System.out.println("Add to first '2' ->" + list);
        list.addLast(5);
        System.out.println("Add to last '5' ->" + list);
        list.deleteLast();
        System.out.println("Delete last ->" + list);
        list.deleteFirst();
        System.out.println("Delete first ->" + list);
        list.delete(3);
        System.out.println("Delete by index 3 ->" + list);
        list.addByIndex(4, 135);
        System.out.println("Add by index 4 item '135' ->" + list);
        list.replace(1, 4);
        System.out.println("Replace by index 1 add 4 ->" + list);
        System.out.println("List size ->" + list.size());

    }
}
