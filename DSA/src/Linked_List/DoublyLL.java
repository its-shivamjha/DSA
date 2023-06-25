package Linked_List;

public class DoublyLL {

    Node head;      // this only stores the reference to node datatype
    Node tail;
    int size = 0;

    public DoublyLL() {
        this.size = size;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;       // in case of first block of list : head = null
        node.prev = null;
        if(head !=null){
            head.prev = node;
        }
        head = node;
        // if tail is not yet initialized i.e there was no element before
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertEnd(int val){
        Node node = new Node(val);

        if(head == null){
            //insertFirst(val);
            node.prev = null;
            head = node;
            size++;
            return;
        }
        Node end = head;
        while(end.next!=null){
            end = end.next;
        }
        end.next = node;
        node.prev = end;
        node.next = null;
        size++;
    }

    public void insert(int val,int index){
        Node node = new Node(val);

        if (head == null) {
            insertFirst(val);
            return;
        }

        // ind will point to the node just before index.
        Node ind = head;
        for (int i = 0; i < index-1; i++) {
            ind = head.next;
        }

        if(ind.next == null){
            insertEnd(val);
            return;
        }

        node.next = ind.next;
        node.prev = ind;
        node.next.prev = node;
        ind.next = node;
        size ++;

    }

    public Node find(int after){
        Node b = head;
        while(b.next !=null){
            if(b.val == after){
                return b;
            }
            b = b.next;
        }
        return  null;
    }

    public void insertAfter(int after,int val){
        Node node = new Node(val);

        Node b = find(after);

        if (b == null) {
            return;
        }

        node.next = b.next;
        if(node.next != null){
            node.next.prev =node;
        }
        node.prev = b;
        b.next = node;
        size++;
        System.out.println("Inserted after :"+after);
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ->");
            temp = temp.prev;
        }
        System.out.println("End");
    }


    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
