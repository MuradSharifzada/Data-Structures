package linked_list;

public class Main {
    static void main() {

        LinkedList linkedList = new LinkedList(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        linkedList.get();
        Node node = linkedList.removeLast();
        System.out.println(node.getValue() + "  is deleted");
    }
}
