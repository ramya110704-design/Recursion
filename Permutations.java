import java.util.Scanner;
public class Permutations{
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);       
                permute(str, l + 1, r);      
                str = swap(str, l, i);       
            }
        }
    }
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.next();

        System.out.println("All permutations of the string:");
        permute(str, 0, str.length() - 1);

        sc.close();
    }
}
