package linked_list;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;


    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node get(int index) {
        if (length == 0 && index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " ");
            temp = temp.next;

        }
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            tail = null;
            head = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
