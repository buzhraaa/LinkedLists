public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.prependNode(30);
        list.prependNode(20);
        list.prependNode(10);
        list.prependNode(5);

        System.out.println("Linked List after prepending nodes: " + list);

        list.addInSortedOrder(15);
        list.addInSortedOrder(25);

        System.out.println("Linked List after adding in sorted order: " + list);
    }
}

