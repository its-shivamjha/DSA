package LinearSearch;

public class One {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13};
        int src = 15;
        System.out.println(check(arr,src));
    }

    static boolean check(int[] arr, int src){
        for(int i : arr){
            if(i == src){
                return true;
            }
        }
        return false;
    }
}
