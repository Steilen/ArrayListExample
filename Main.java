import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("Your numbers: " + numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all numbers: " + sum);
    }
}