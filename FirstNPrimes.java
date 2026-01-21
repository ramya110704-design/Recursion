import java.util.Scanner;
public class FirstNPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many prime numbers you want:");
        int n = sc.nextInt();
        int count = 0;   
        int num = 2;     
        System.out.println("First " + n + " prime numbers:");
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;  
            }
            num++;  
        }
        sc.close();
    }
}
