package Stacks_Queues;

public class CustomQueue{
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;
     
    public CustomQueue(){
        this.data = new int[DEFAULT_SIZE];
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }

    protected boolean isFull(){
        return end == data.length-1;
    }
    protected boolean isEmpty(){
        return end <= -1;
    }

    public void push(int item){
        if(isFull()){
            System.out.println("Queue Full");
        }
        data[++end] = item;
    }

    public void remove(){

        // shift the array by one place left : O(n)
        for(int i = 1;i<data.length ;i++){
            data[i-1] = data[i];
        }
        end--;
    }

    public void front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }else{
            System.out.println(data[0]);
        }   
        
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0;i<=end;i++){
            sb.append(data[i]);
            if(i!= end){
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

}
