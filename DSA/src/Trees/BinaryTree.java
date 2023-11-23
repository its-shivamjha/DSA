package Trees;

import java.util.Scanner;

class BinaryTree {
    public BinaryTree(){}

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    // insert element : insert root
    public void populate(Scanner scanner){
        System.out.println("Enter root node");
        root = new Node(scanner.nextInt());
        populate(scanner,root);
    }
    
    // insert left and right nodes
    public void populate(Scanner scanner,Node node){
        System.out.println("Want to add left of " +node.value+"?");
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to add to the left: "+node.value);
            node.left = new Node(scanner.nextInt());
            populate(scanner,node.left);
        }

        System.out.println("Want to add right of " +node.value+"?");
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to add to the right of: "+node.value);
            node.right = new Node(scanner.nextInt());
            populate(scanner,node.left);
        }
    }

    // Display 
    public void Display(){
        Display(this.root,"");
    }

    private void Display(Node node, String indent){
        if(node == null) return;
        System.out.println(indent+node.value);
        Display(node.left, indent +"\t");
        Display(node.right, indent +"\t");
    }
    
}