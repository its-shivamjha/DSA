package Linked_List;

public class Main {
    public static void main(String[] args) {

//        singly linked list
        LinkedList list = new LinkedList();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(0);
        list.insertLast(99);
        list.insert(88,3);

        list.deleteFirst();
        list.display();
        System.out.println(list.size);

        list.deleteLast2();
        list.display();
        System.out.println(list.size);

        list.deleteIndex(2);
        list.display();
        System.out.println(list.size);

        list.display();
        System.out.println(list.indexOfValue(2));

        System.out.println("Doubly Linked List : ");

        DoublyLL list2 = new DoublyLL();

        list2.insertFirst(3);
        list2.display();

        list2.insertFirst(2);
        list2.insertFirst(1);
        list2.display();

        list2.displayReverse();

        list2.insertEnd(4);
        list2.insertEnd(5);
        list2.display();

        DoublyLL list3 = new DoublyLL();

        list3.insertEnd(4);
        list3.insertEnd(6);
        list3.insert(5,1);
        list3.display();

        list3.insertAfter(5,99);
        System.out.println();
        list3.display();

        System.out.println("Circular Linked List: ");
        CirclularLL list4 = new CirclularLL();
        list4.insert(1);
        list4.insert(2);
        list4.insert(3);
        list4.insert(4);

        list4.display();
        list4.delValue(3);
        list4.display();



    }

}
