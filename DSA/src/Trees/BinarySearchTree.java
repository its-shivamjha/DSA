package Trees;

import java.util.Scanner;

public class BinarySearchTree {
    BinarySearchTree(){}
    private class  Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    // get height
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    // is empty 
    public boolean isEmpty(){
        return root == null;
    }

    // display function
    public void display(){
        display(root,"Root node: ");
    }

    public void display(Node node, String details){
        if(node == null) return;
        System.out.println(details+node.getValue());
        display(node.left,"Left child of "+node.getValue()+" : ");
        display(node.right,"Right child of "+node.getValue()+" : ");
    }


    // if we try directly using node as an argument in the next function coz root is private 
    // and the objects of BST class can't pass a node from outside coz class "Node" is private
    // and they are unaware of all these.

    public void preOrder(){
        System.out.println("PreOrder: ");
        preOrder(root);
    }


    // Pre order traversal
    public void preOrder(Node node){
        if(node == null) return;
        System.out.print(node.value+" ");       // print the root (a time will come when left and right will also become root then print it)
        preOrder(node.left);                    // for inOrder sout in middle.
        preOrder(node.right);                   // for postOrder sout in end.
    }



    // To insert a node in the tree 
    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left = insert(value, node.left);
        }else{
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        // if we're not adding either left or right directly to this node then return it.
        return node;
    }


    // to add multiple nodes at once
    public void populate(Scanner scanner){
        int val = scanner.nextInt();
        if(val != -1){
            insert(val);
            populate(scanner);
        }else{
            return;  
        }
    }

    // Check if the tree is balanced
    public boolean balance(){
        return balance(root);
    }

    private boolean balance(Node node){
        if(node == null) return true;

        return Math.abs(height(node.left)-height(node.right))<=1 && balance(node.left) && balance(node.right);
    }

}
