package Stacks_Queues;

public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();                // call CustomStack()
    }

    public DynamicStack(int size){
        super(size);                // call CustomStack()
    }

    @Override
    public void push(int items){
        if(this.isFull()){
            // double the array size
            int[] temp = new int[2* data.length];

            // copy all previous items in the new array
            for(int i = 0;i<data.length;i++){
                temp[i] = data[i];
            }
            // assigning temp to data ref variabe
            data = temp;
        }

        // Now array is not full
        super.push(items);
        
    }

}
