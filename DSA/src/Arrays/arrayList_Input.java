package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        //taking input
        for ( int i =0;i<5;i++){
            list.add(in.nextInt());
        }

        System.out.println(list);           //no need to use toString
        System.out.println(list.get(1));    //get item at any index

        //output by loops
        for( int i = 0;i<5;i++){
            System.out.print(list.get(i));
        }

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>(5);

        //INPUT
        //initialize the list
        for (int i = 0;i<3;i++){
            list1.add(new ArrayList<>());
        }

        for (int i = 0;i<3 ;i++){
            for (int j = 0;j<3;j++){
                list1.get(i).add(in.nextInt());
            }
        }

        //output
        for(int i = 0;i<3;i++){
            System.out.println(list1.get(i));
        }

        System.out.println(list1);

    }
}
