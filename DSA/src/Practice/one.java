package Practice;

import java.util.Arrays;

public class one {
    public static void main(String[] args) {

        int[] arr = {-1,-5,-6,-7,8,5,4,2,1};
        int[] arr2 = {-1,-5,-6,-7,8,5,4,2,1};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,8));

        System.out.println(Arrays.equals(arr,arr2));


        // Reversing an array
        int n = arr2.length;
        int mid = (arr2.length)/2;
        for(int i = 0;i<mid;i++){
            int temp = arr2[i];
            arr2[i] = arr2[n-i-1];
            arr2[n-i-1] = temp;
        }

        System.out.println("This is arr2 after reversal " +Arrays.toString(arr2));
        System.out.println("This is arr1 "+Arrays.toString(arr));


        // swapping two arrays
        System.out.println("After swapping :");
        for(int i = 0;i<n;i++){
            int temp = arr[i];
            arr[i] = arr2[i];
            arr2[i] = temp;
        }

        System.out.println("arr : "+ Arrays.toString(arr));
        System.out.println("arr2 : "+ Arrays.toString(arr2));


        int[] array = {1, 2, 4, 5, 8, -7, -6, -5, -1};
        System.out.println(Arrays.toString(array));

        // Insertion Sort
        for(int i = 0;i<n;i++){
            int max = max(array,n-i-1);
            swap(array,n-i-1,max);
        }


        System.out.println("Insertion Sort : " + Arrays.toString(array));


//        // bubble sort
//        for(int i = 0;i<n;i++){
//            for(int j = 1;j<n-i;j++){
//                if(array[j]<array[j-1]){
//                    swap(array,j);
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));

    }
//    static void swap(int[] arr,int j){
//        int temp = arr[j];
//        arr[j] = arr[j-1];
//        arr[j-1] = temp;
//    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int max(int[] arr,int n){
        int max = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
