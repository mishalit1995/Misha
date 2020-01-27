package home_work_12;

import java.util.StringJoiner;

public class List<T>  {
    private Node <T> first;
    private int size = 0;

    public List() {
    }

    public List(T[] item) {
        for (T element : item) {
            addLast(element);
        }
    }
    public void addFirst(T item) {
        first = new Node<T>(item, first);
        size++;
    }

    public void addLast(T item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node<T> last = getNodeByIndex(size - 1);
            last.next = new Node<>(item, null);
            size++;
        }
    }

    public void addByIndex(int index, T item) {
        if (isFirstElement(index)) {
            addFirst(item);
        } else if (isLastElement(index)) {
            addLast(item);
        } else {
            Node<T> temp = getNodeByIndex(index - 1);
            temp.next = new Node<T>(item, temp.next);
            size++;
        }
    }
    public void deleteFirst() {
        if (!isEmpty()) {
            first = first.next;
            size--;
        }
    }

    public void deleteLast() {
        if (size == 1) {
            deleteFirst();
        } else if (!isEmpty()) {
            Node<T> prev = getNodeByIndex(size - 2);
            prev.next = null;
            size--;
        }
    }

    public void delete(int index) {
        if (isFirstElement(index)) {
            deleteFirst();
        } else if (isLastElement(index)) {
            deleteLast();
        } else {
            Node<T> temp = getNodeByIndex(index - 1);
            temp.next = temp.next.next;
            size--;
        }
    }

    private Node<T> getNodeByIndex(int index) {
        Node<T> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void replace(int firstIndex, int secondIndex) {
        Node<T> firstIndexNode = getNodeByIndex(firstIndex);
        Node<T> secondIndexNode = getNodeByIndex(secondIndex);

        if (firstIndexNode == secondIndexNode) {
            return;
        }

        Node<T> firstIndexNodeBefore = getNodeByIndex(firstIndex - 1);
        Node<T> secondIndexNodeBefore = getNodeByIndex(secondIndex - 1);

        if (isLastElement(firstIndex)) {
            first = secondIndexNode;
        } else {
            firstIndexNodeBefore.next = secondIndexNode;
        }

        if (isFirstElement(secondIndex)) {
            first = firstIndexNode;
        } else {
            secondIndexNodeBefore.next = firstIndexNode;
        }

        Node<T> temp = secondIndexNode.next;
        secondIndexNode.next = firstIndexNode.next;
        firstIndexNode.next = temp;
    }
    public String toString() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        Node<T> temp = first;
        while (temp != null) {
            sj.add(temp.item.toString());
            temp = temp.next;
        }
        return sj.toString();
    }

    public  boolean isEmpty() {
        return size == 0;
    }

    public  int size() {
        return size;
    }


    private boolean isFirstElement(int index) {
        return index == 0;
    }
    private boolean isLastElement(int index) {
        return index == size;
    }


}



