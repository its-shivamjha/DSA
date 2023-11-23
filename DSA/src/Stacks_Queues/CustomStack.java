package Stacks_Queues;


public class CustomStack{
    int ptr = -1;
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    CustomStack(){
        this.data = new int[DEFAULT_SIZE];
    }
    CustomStack(int size){
        this.data = new int[size];
    }

    public void push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        data[++ptr] = item;
    }

    public void pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        ptr--;
    }

    public int peek(){
        return data[ptr];
    }

    protected boolean isFull(){
        return ptr == data.length-1;
    }
    protected boolean isEmpty(){
        return ptr == -1;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < ptr; i++) {
            sb.append(data[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
