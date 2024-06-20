package Trees.DP;

public class Toi {
    public static void main(String[] args) {
        int n = 3;
        move(n,'A','C','B');
    }

    static void move(int n, char from, char to , char aux){
        if(n == 1){
            System.out.println("Move disk 1 from "+from+" to disk "+ to);
            return;
        }
        move(n-1,from ,aux, to);
        System.out.println("Move disk "+n+" from "+ from+ " to disk "+to);
        move(n-1,aux,to,from);
    }
}
