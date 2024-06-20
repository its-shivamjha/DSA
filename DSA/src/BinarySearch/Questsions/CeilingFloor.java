package BinarySearch.Questsions;

public class CeilingFloor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,10,22};
        System.out.println(ceiling(arr,23));
        System.out.println(floor(arr,8));
    }

    static int ceiling(int[] arr,int target){           //ceiling of a number is the smallest number which is greater than or equals to target.
        if (target > arr[arr.length - 1]) { // if there's no number greater than target
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end -start)/2;

            
            if(target== arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return start;       //when end > start, and we need the smallest number which is greater than "target" so the answer will be "start".

    }

    static int floor(int[] arr,int target){         //floor of a number is the greatest number less than or equal to target
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(target < arr[0]){                    //if there's no number less than target
                return -1;
            }
            if(target == arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return end;     //when start is greater than end ,and we need the gratest number which is greater than the "target" so the answer will be "end".
    }
}
