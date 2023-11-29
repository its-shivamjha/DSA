package Trees;

public class SegmentTrees {
    public static void main(String[] args) {
        // Given a range we've to find the sum of it in O(logN)
        int[] arr = {3,8,7,6,-2,-8,4,9};

        SegmentTrees segTrees = new SegmentTrees(arr);      // creation : O(N)
        // segTrees.display();
        System.out.println(segTrees.query(2, 6));   // getting the answer : O(logN)
        // segTrees.update(7, 7);
        segTrees.display();

    }

    private class  Node {
        int data;
        int start;
        int end;
        Node left;
        Node right;

        public Node(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    private Node root;

    public SegmentTrees(int[] arr){
        // create a tree using this array
        this.root = constructTree(arr, 0,arr.length-1);
    }

    // O(n) to construct tree once
    private Node constructTree(int[] arr, int start, int end){

        // leaf node
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data =arr[start]; 
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = (start + end)/2;

        node.left = this.constructTree(arr, start, mid);
        node.right =  this.constructTree(arr, mid+1, end);

        node.data = node.left.data + node.right.data;       // updating the sum
        return node;
    }

    void display(){
        display(this.root);
    }

    void display(Node node){
        if(node == null) return;
        System.out.println("Root Interval: [ "+node.start+","+node.end+" ]  data: "+node.data);
        if(node.left != null){
            System.out.println("Left Interval: [ "+node.left.start+","+node.left.end+" ]  data: "+node.left.data);
        }
        if(node.right != null){
            System.out.println("Right Interval: [ "+node.right.start+","+node.right.end+" ]  data: "+node.right.data);
        }

        display(node.left);
        display(node.right);
    }

    public int query(int qsi, int qei){
        return this.query(this.root,qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        // node lies completely inside the query interval
        if(node.start >= qsi && node.end <= qei){
            return node.data;
        }
        // node lies completely outside the query interval
         if(node.start > qei || node.end < qsi){
            return 0;
        }
        // overlapping
        return query(node.left, qsi, qei) + query(node.right, qsi, qei);
    }

    // update
    public void update(int index ,int value){
        this.root.data = update(this.root,index, value);
    }

    private int update(Node node, int index, int value){
        if(index >= node.start && index <= node.end){
            if(index == node.start && index == node.end){
                node.data = value;
                return node.data;
            }else{
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }




}
