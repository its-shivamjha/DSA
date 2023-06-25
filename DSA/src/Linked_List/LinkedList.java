package Linked_List;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        this.size = 0;
    }

//    Get node at a particular index
    public Node getNode(int index){
        Node node = head;
        for(int i = 0;i<index;i++){
            node = node.next;
        }
        return node;
    }

//    find a value
    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int indexOfValue(int val){
        Node node = head;
        int ind = 0;
        while(node.value != val) {
            node = node.next;
            ind++;
        }
        return ind;
    }

    public void showIndexValue(int index){
        System.out.println(getNode(index).value);
    }


//    Insert at the first position
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size++;
    }

//    Add in the last of the list
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

//    Insert at index
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
        }
        if(index == size){
            insertLast(val);
        }

        // this variable should point to just before node
        Node temp = head;
        for(int i = 1;i<index;i++){
            temp = temp.next;
        }

        // Now temp is pointing to the node just before the index

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }


//    Delete at first
    public void deleteFirst(){
        if(head == tail){
            head = null;
            tail = null;
        }
        head = head.next;
        size--;
    }

//    Delete at last
    public void deleteLast1(){
        Node temp = head;
        if(head == tail){
            head = null;
            tail = null;
        }
//        while (temp.next.next != null){
//            temp = temp.next;
//        }
        while (temp.next != tail){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteLast2(){
        // index = size -1 - coz index starts from 0 and size from 1
        Node secondLast = getNode(size-2);
        secondLast.next = null;
        tail = secondLast;
        size--;
    }

//    Delete a particular Index and show the deleted item
    public void deleteIndex(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size-1){
            deleteLast2();
        }
        
        Node prev = getNode(index-1);
        prev.next = prev.next.next;
        size--;
    }

//    Display this list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ->");
            temp = temp.next;
        }
        System.out.println("End");
    }



//    Defining the structure of each node.
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
