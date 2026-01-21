import java.util.Scanner;
public class FibonacciLoop {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit for Fibonacci sequence:");
        int limit = sc.nextInt();
        int a = 0;  
        int b = 1;  
        System.out.println("Fibonacci sequence up to " + limit + ":");
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;           
            a = b;                     
            b = next;
        }
        sc.close();
    }
}
