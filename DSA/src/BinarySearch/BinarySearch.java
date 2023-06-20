package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        // it's used for sorted arrays

        int[] arr = { -4,-2,-1,0,1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,8));        //for ascending array

        int[] arr1 ={9,8,7,6,5,4,3,2,1,0,-1,-2,-3};
        System.out.println(binarySearch1(arr1,4));      //for descending array

    }
    static int binarySearch(int[] arr,int target){              //ascending function
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            // int mid = (start+end)/2      when the value of start and end is big enough it'll fill the integer memory

            int mid = start + (end -start)/2;
            if(target <arr[mid]){          //left side - end = mid -1
                end = mid -1;
            }else if(target >arr[mid]){     //right side - start = mid + 1
                start = mid + 1;
            }else{
                return mid;             //returning index of the found target
            }
        }
        return -1;                      //array not found
    }

    static int binarySearch1(int[] arr,int target){             //descending function
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            // int mid = (start+end)/2      when the value of start and end is big enough it'll fill the integer memory

            int mid = start + (end -start)/2;
            if(target > arr[mid]){      // left side - end = mid-1
                end = mid -1;
            }else if(target < arr[mid]){        //right side - start = mid + 1
                start = mid + 1;
            }else{
                return mid;             //returning index of the found target
            }
        }
        return -1;                      //array not found
    }


}
