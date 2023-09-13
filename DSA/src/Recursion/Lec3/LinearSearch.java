package Recursion.Lec3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        // LINEAR SEARCH USING RECURSION
        int[] arr = {1,18,4,5,18,18,4,32};
        int target = 18;
        System.out.println(linearSearch(arr,0,target));


        mulLinearSearch(arr,0,target);
        System.out.println(list);


        // returning arraylist
        System.out.println(mulLinearSearch2(arr,0,target,new ArrayList<>()));

        System.out.println(mulLinearSearch3(arr,0,target));



    }
    static int linearSearch(int[] arr, int index,int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return linearSearch(arr,++index,target);
        }

        // or return arr[index] == target || linearSearch(arr,++index,target);
    }


    // MULTIPLE OCCURENCES
    static ArrayList<Integer> list = new ArrayList<>();
    static void mulLinearSearch(int[] arr, int index,int target){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        mulLinearSearch(arr,index + 1,target);
    }

    // RETURNING ARRAYLIST by taking list in argument
    static ArrayList mulLinearSearch2(int[] arr, int index, int target, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return mulLinearSearch2(arr,index + 1,target,list);
    }

    // RETURNING ARRAYLIST without list in argument
    static ArrayList mulLinearSearch3(int[] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> listFromPrevCalls = mulLinearSearch3(arr,index + 1,target);
        list.addAll(listFromPrevCalls);
        return list;
    }




}
