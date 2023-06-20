package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,55,33,22,55,33};
        System.out.println(searchInRange(arr,2,7,8));


    }
    static boolean searchInRange(int[] arr,int start ,int end ,int obj){
        for(int i = start;i<end;i++){
            if(arr[i] == obj){
                return true;
            }
        }
        return false;
    }
}
