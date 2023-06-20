package LinearSearch;

public class MinValueIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {21,44,21},
                {88,22,99,11},
                {12,23,34,45,56}
        };
        System.out.println(minValue(arr));
    }

    static int minValue(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            }

//        for (int[] i : arr) {
//            for (int j : ints) {
//                if (j < min) {
//                    min = j;
//                }
//            }
//        }
        return min;
    }
}
