package Random;

public class bs {
    public static void main(String[] args) {
        int[] arr = { -4,-2,-1,0,1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,8));        //for ascending array
    }

    static int binarySearch(int[] arr, int t){
        int n = arr.length;
        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int mid = s+ (e-s)/2;

            if(arr[mid] == t){
                return(mid);
            }
            if(t>arr[mid]){
                s= mid+1;
            }
            if(t<arr[mid]){
                e = mid-1;
            }
        }
        return -1;
    }
}
