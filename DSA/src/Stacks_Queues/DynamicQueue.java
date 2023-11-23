package Stacks_Queues;

public class DynamicQueue extends CircularQueue{

    DynamicQueue(){
        this.data = new int[DEFAULT_SIZE];
    }
    DynamicQueue(int size){
        super(size);
    }
    @Override
    public void push(int item){
        if(this.isFull()){
            int[] temp = new int[2*this.data.length];
            for(int i =0;i<data.length;i++){
                temp[i] = data[(front+i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }else{
            super.push(item);
        }


    }
}
