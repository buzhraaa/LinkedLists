import java.util.ArrayList;
import java.util.List;

public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public void prependNode(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        this.head = newNode;
    }

    public void addInSortedOrder(int value) {
        if (this.head == null) {
            this.head = new Node(value);
        } else if (this.head.getValue() > value) {
            prependNode(value);
        } else if (this.head.getValue() < value) {
            Node i = this.head;
            Node j = this.head.getNext();

            while (j != null && j.getValue() < value) {
                i = i.getNext();
                j = j.getNext();
            }

            Node newNode = new Node(value);
            i.setNext(newNode);
            newNode.setNext(j);
        }
    }

    @Override
    public String toString() {
        List<Integer> arr = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            arr.add(temp.getValue());
            temp = temp.getNext();
        }

        return arr.toString();
    }
}
