
import java.util.Scanner;

public class Task2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        int total = 0;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int numbers = i * j;
                if (numbers < 10) {
                    System.out.print("   " + numbers);   
                } else {
                    System.out.print("  " + numbers);   
                }
                total += numbers;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Total of all numbers: " + total);
        sc.close();
    }
}
