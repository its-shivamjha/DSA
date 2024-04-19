package Trees.Self_Balancing;

import java.util.Scanner;

public class AVL {
    AVL(){}
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

    public int height(){
        return height(root);
    }

    // get height
    private int height(Node node){
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



    // To insert a node in the tree and rotate if needed
    public void insert(int value){
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            node.height = 0;
            return node;
        }
        if(value<node.value){
            node.left = insert(value, node.left);
        }else{
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        // if we're not adding either left or right directly to this node then return it.
        return rotate(node);
    }

    private Node rotate(Node node){
        // if left is heavy
        if(height(node.left)-height(node.right)>1){
            if(height(node.left.left) - height(node.left.right) >0){
                // left left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                // left right case
                node.left =  leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // if right is heavy 
        if(height(node.right)-height(node.left)>1){
            // right heavy
            if(height(node.right.right) - height(node.right.left) > 0){
                // right right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                // right left case
                node.right =  rightRotate(node.right);
                return leftRotate(node);
            }
        }

        // if node is already balanced return it as it is
        return node;
    }

    // Right rotate
    Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;

        // update the height
        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;

        return c;
    }

    Node leftRotate(Node p){
        Node c = p.right;
        Node t = c.left;
        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right))+1;
        c.height = Math.max(height(c.left), height(c.right))+1;

        return c;
    }

}
