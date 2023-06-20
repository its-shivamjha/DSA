package Arrays;

import java.util.ArrayList;

public class arrayList {                        //arraylist is resizable array
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<Boolean> result = new ArrayList<>(10);
        System.out.println(result);


        list.add(55);           //can't be indexed using loops
        list.add(77);
        list.add(0);
        list.add(3);

        list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(0));
        list.set(0,99);
        System.out.println(list);


    }
}
