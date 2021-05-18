package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        System.out.println("1つ目の整数を入力してください:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        scanner.next();

        System.out.println("2つ目の整数を入力してください:");
        int number2 = scanner.nextInt();
        scanner.next();

        int sum = number1 + number2;

        System.out.println(number1 + " + " + number2 + " = " + sum);
    }
}
