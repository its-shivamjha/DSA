package Practice;

public class test {
    public static void main(String[] args) {
        print(5,0,0);
        System.out.println();

        // through iteration
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
    static void print(int r,int c,int count){
        if(r == count){
            return;
        }
        if(c<r){
            System.out.print('$');
            print(r,c+1,count);
        }else{
            System.out.println();
            print(r,0,++count);
        }
    }
}
