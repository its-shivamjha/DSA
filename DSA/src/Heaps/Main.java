package Heaps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MinHeap hp = new MinHeap();
        for(int i = 0;i<5;i++){
            hp.add(in.nextInt());
        }

        hp.viewHeap();
        System.out.println(hp.heapSort());
        hp.remove();
        hp.viewHeap();
    }
}


class MinHeap{
    int N;
    List<Integer> heap;

    public MinHeap(){
        heap = new ArrayList<>();
        heap.add(0);
    }

    int parent(int curr){
        return curr/2;
    }

    int left(int curr){
        return 2*curr;
    }

    int right(int curr){
        return 2*curr+1;
    }

    void viewHeap(){
        System.out.println(heap);
    }

    void add(int num){
        heap.add(num);

        int curr = heap.size()-1;
        while (parent(curr) > 0 && heap.get(parent(curr)) > heap.get(curr)) {
            Collections.swap(heap, parent(curr), curr);
            curr = parent(curr);
        }
    }

    void remove(){
        // edge cases

        // remove the last element and replace it with root
        heap.set(1,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int curr = 1;

        while(true){

            // find smallest among, curr, left and right child
            int smallest = curr;
            if(left(curr) < heap.size() && heap.get(left(curr)) < heap.get(smallest)){
                smallest = left(curr);
            }
            if(right(curr) < heap.size() && heap.get(right(curr)) < heap.get(smallest)){
                smallest = right(curr);
            }

            // if curr is smallest
            if(smallest == curr) return;

            Collections.swap(heap, curr, smallest);
            curr = smallest;
        }
    }

    int getMin(){
        return heap.get(1);
    }

    List<Integer> heapSort(){
        List<Integer> list = new ArrayList<>();

        while(heap.size() > 1){
            list.add(getMin());
            remove();
        }

        return list;
    }
}