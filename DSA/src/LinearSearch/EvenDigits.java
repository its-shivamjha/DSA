package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {22,1,3,4433};
        System.out.println(evenDigits(nums));
    }

    static int evenDigits(int[] arr){

        int count = 0;
        for(int i: arr){
            if(even(i)){
                count++;
            }
        }
        if(count == 0){
            return 1;
        }
        return count;
    }

//    static boolean even(int i){
//             if((i+"").length()%2==0){
//                 return true;
//             }
//         return false;
//    }

    static boolean even(int i){
        int count = 0;
        while(i>0){
            count++;
            i= i/10;
        }
        return count%2 ==0;
    }
}
