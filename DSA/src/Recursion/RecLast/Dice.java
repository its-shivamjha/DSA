package Recursion.RecLast;

public class Dice {
    public static void main(String[] args) {
        dice("",4,4);
        
    }
    // Given a target you've to print what all combination will you add to achieve it 
    static void dice(String p, int up , int target){
        if(up == 0){
            System.out.println(p);
            return;
        }

        int i = 1;
        while(i<=target && i<=up){
            dice(p+i ,up-i,target);
            i++;
        }
    }
}
