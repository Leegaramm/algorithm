import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[num-1]);
    }
}