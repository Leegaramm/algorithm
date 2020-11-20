import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int i = input.nextInt();
        int j;
        for(int h= 1; h<=i; h++) {
            for(j=0; j<h; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}