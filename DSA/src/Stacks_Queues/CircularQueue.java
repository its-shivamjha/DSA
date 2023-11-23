package Stacks_Queues;

public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;

    int front = 0;
    int end = 0;
    int size = 0;
     
    public CircularQueue(){
        this.data = new int[DEFAULT_SIZE];
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }

    protected boolean isFull(){
        return size == data.length;
    }
    protected boolean isEmpty(){
        return size <= -1;
    }

    public void push(int item){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            data[end++] = item;
            end %= data.length;            // if end = data.length-1 end++ will become out of bound, so rather use modulo here
            size++;
        }
    }

    public void remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        front++;
        front %= data.length;                       // if front = last element , front++ will become out of bound so use modulo
        size--;
    }

    //! This was a bit tricky 

    public void display(){
        System.out.print("front->");
        int i = front;
        do{
            System.out.print(data[i] + "->");
            i++;
            i %= data.length;
        }while(i != end);
        System.out.println("end");
    }
    
}
