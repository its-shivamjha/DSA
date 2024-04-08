import java.util.PriorityQueue;

public class Sample {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,4,3,9,8};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }
        System.out.println(pq);
    }
}
