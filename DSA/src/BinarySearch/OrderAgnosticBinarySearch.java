package BinarySearch;

public class OrderAgnosticBinarySearch {                        //where we don't know whether its sorted ascending or descending.
    public static void main(String[] args) {
        int[] arr = {-4, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};            //Descending array
        int target = -4;
        System.out.println(orderAgnosticBinarySearch(arr, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //check ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {                    //left side - end = mid -1
                    end = mid - 1;
                } else {                                  //right side - start = mid + 1
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {                  // left side - end = mid-1
                    end = mid - 1;
                } else {                                 //right side - start = mid + 1
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
