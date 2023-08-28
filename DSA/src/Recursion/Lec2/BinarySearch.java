package Recursion.Lec2;

public class BinarySearch {
    //BINARY SEARCH USING RECURSION :

    public static void main(String[] args){
        int[] arr = {2,5,7,9,11,22,55,73,83,94};
        int target = 73;
        int ans = binarySearch(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target, int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target> arr[mid]){
            return binarySearch(arr,target,mid+1,e );
        }
        return binarySearch(arr,target,s,mid -1);
    }
}
