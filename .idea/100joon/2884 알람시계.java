import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();

        if(m>=45){
            System.out.println(h);
            System.out.println(m-45);
        } else if(m<45 && h!=0){
            System.out.println(h-1);
            System.out.println(60+(m-45));
        } else if(m<45){
            h = 23;
            System.out.println(h);
            System.out.println(60+(m-45));
        }

    }
}