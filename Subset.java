import java.util.Scanner;
public class Subset {
    public static void generateSubsets(int[] set, int index, String current) {
        if (index == set.length) {          
            System.out.println("{" + current + "}");
            return;
        }
        generateSubsets(set, index + 1, current + set[index] + " ");
        generateSubsets(set, index + 1, current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the set:");
        int n = sc.nextInt();

        int[] set = new int[n];
        System.out.println("Enter the elements of the set:");
        for (int i = 0; i < n; i++) {
            set[i] = sc.nextInt();
        }

        System.out.println("All possible subsets:");
        generateSubsets(set, 0, "");

        sc.close();
    }
}
