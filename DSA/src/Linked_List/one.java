package Linked_List;
// items are not in contigious memory allocated


public class one {

    static class Node{
        int data;
        Node next;
    }

    public static void main(String[] args) {
        Node list = new Node();
        list.data = 5;
        list.next = new Node();
        list.next.data = 2;

        System.out.println(list.data+" -> "+list.next.data);
    }

}
