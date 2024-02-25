import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1 = 0, number2 = 1, count, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        count = input.nextInt();

        for (int i = 0; i <= count; i++) {
            total = number1 + number2;
            System.out.print(number1 + " ");
            number1 = number2;
            number2 = total;
        }
    }
}