package BinarySearch.Questsions;

public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5 ,7,9,11,12,13,14,15,17,19,20,22,25};
        // ans = 13 
        int target = 20;

        int start = 0;
        int end = 1;


        // exponentially grow the window size
        while(target > arr[end]){
            int size = end - start +1;
            start = end +1;
            end += 2*size;
        }

        int ans = bs(arr,start,end,target);
        System.out.println(ans);
    }

    static int bs(int[] arr,int s, int e,int target){
        if(s > e){
            return -1;
        }

        int mid = s+(e-s)/2;

        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return bs(arr, s, mid-1, target);
        }else{
            return bs(arr, mid+1, e, target);
        }
    }
}
