package home_work_12;



public class Node<T> {
    T item;
    Node <T> next;

    public Node(T element, Node<T> next) {
        this.item = element;
        this.next = next;
    }
}
