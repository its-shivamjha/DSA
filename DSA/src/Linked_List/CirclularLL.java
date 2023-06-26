package Linked_List;

public class CirclularLL {
    private Node head;
    private Node tail;
    int size = 0;

//    public CirclularLL(Node head, Node tail) {
//        this.head = head;
//        this.tail = tail;
//    }

    //    insert after tail
    public void insert(int val){
        Node node = new Node(val);
        if(tail == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;
        if(head!=null){
            // do while is very helpful in case of circular linked list.
            do{
                System.out.print(temp.value+"->");
                temp = temp.next;
            }while (temp != head);
        }
        System.out.println("Head");
    }

    public void delValue(int delValue){
        Node temp = head;
        if(head == null){
            return;
        }
        while(temp.next.value != delValue){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
