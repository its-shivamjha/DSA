package Trees;

public class AVL2 {
    private class  Node {
        private int value;
        private int height;
        private Node left;
        private Node right;
        
        public Node(int value){
            this.value = value;
        }
    }

    public AVL2(){};

        private Node root;

        public int height(){
            return height(root);
        }
        private int height(Node node){
            if(node == null) return -1;
            return node.height;
        }

        public void insert(int value){
            root =  insert(root,value);
        }

        private Node insert(Node node, int value){
            if(node == null){
                node = new Node(value);
                node.height = 0;
                return node;
            }

            if(value<node.value){
                node.left = insert(node.left, value);
            }
            if(value >node.value){
                node.right = insert(node.right, value);
            }

            // height of any particular node || height = Max out of (left subtree / right subtree) + 1
            node.height = Math.max(height(node.left), height(node.right)) + 1;

            // bottom up checking of any unbalanced node while returning
            return rotate(node);
        }

        private Node rotate(Node node){
            if(height(node.left) - height(node.right) > 1){     // left heavy

                if(height(node.left.left) > height(node.left.right)){        
                    // left left
                    return rightRotate(node);
                }

                if(height(node.left.left) < height(node.left.right)){        
                    // left left
                    node.left = leftRotate(node.left);
                    return rightRotate(node);
                }

            }
            if(height(node.right) - height(node.left) > 1){     // right heavy

                if(height(node.right.right) > height(node.right.left)){        
                    // right right
                    return leftRotate(node);
                }

                if(height(node.right.right) < height(node.right.left)){        
                    // right left
                    node.right = rightRotate(node.right);
                    return leftRotate(node);
                }

            }

            return node;
            
        }

        private Node leftRotate(Node p){
            Node c = p.right;
            Node t = c.left;
            c.left = p;
            p.right = t;

            p.height = Math.max(height(p.left), height(p.right)) + 1;
            c.height = Math.max(height(c.left), height(c.right)) + 1;

            return c;
        }

        private Node rightRotate(Node p){
            Node c = p.left;
            Node t = c.right;
            c.right = p;
            p.left = t;

            p.height = Math.max(height(p.left), height(p.right)) + 1;
            c.height = Math.max(height(c.left), height(c.right)) + 1;

            return c;
        }
   
}
