package Patterns.CyclicSort;

public class MissingNumber {

//     Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
// Follow up: Could you implement a solution using only 0 (1) extra space complexity and O(n)
// runtime complexity?
    public static void main(String[] args) {
        int[] arr = {3,1,0};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int arr[]) {
        int n = arr.length;
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            // if arr[i] is at correct index , let it be, move on
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (i != arr[i]) {
                return i;
            }
        }

        return n;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
