package LinearSearch;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,55,33,22,55,33};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int max = arr[0];
        for(int i: arr){
            if( i < max){
                max = i;
            }
        }
        return max;


    }


}
