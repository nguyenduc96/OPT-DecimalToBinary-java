import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        printBinary(scanner, stack);
    }

    private static void printBinary(Scanner scanner, Stack<Integer> stack) {
        System.out.print("Nhập số cần chuyển : ");
        int number = scanner.nextInt();
        decimalToBinary(number, stack);
        System.out.print("Số nhị phân : ");
        for (Integer s : stack) {
            System.out.print(s);
        }
        System.out.println("\n");
        stack.clear();
        printBinary(scanner, stack);
    }

    public static void decimalToBinary(int number, Stack<Integer> stack) {
        if (number == 0) {
            return;
        } else {
            int numberBinary = number % 2;
            decimalToBinary(number / 2, stack);
            stack.push(numberBinary);
        }
    }
}
