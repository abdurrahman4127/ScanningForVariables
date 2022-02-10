import java.util.Arrays;
import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = scanner.nextInt();
        double dbl = scanner.nextDouble();

        scanner.nextLine(); //nextInt method wouldn't read the "/n" newline character that is given through stdin by user.

        String str = scanner.nextLine();

        // array scanning
        System.out.println("enter the size of the array : ");
        int size = scanner.nextInt();
        int []A = new int[size];

        // scanning the array
        for (int i=0; i<size; i++) {
            System.out.print(i + " index : ");
            A[i] = scanner.nextInt();
        }

        // printing array (without for-loop)
        System.out.println(Arrays.toString(A));

        scanner.close(); // not really necessary in this context

        System.out.println("Double: " + dbl);
        System.out.println("Integer: " + integer);
        System.out.println("String: " + str);
    }
}
