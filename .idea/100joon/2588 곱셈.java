import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();


        System.out.println(n1*(n2%10));
        System.out.println(n1*((n2/10)%10));
        System.out.println(n1*(n2/100));
        System.out.println(n1*n2);
    }
}