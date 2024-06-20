public class One {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for(int i = 0;i<5;i++){
            int ans = a + b;
            a = b;
            b = ans;
            System.out.println(ans);
        }
    }
}
