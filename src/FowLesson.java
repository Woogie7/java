import java.util.Scanner;
public class FowLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число M: ");
        int M = scanner.nextInt();

        for (int number = 1; number <= M; number++) {
            if (isArmstrong(number)) {
                System.out.println(number + " - число Армстронга");
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;

        for (originalNumber = number; originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return result == number;
    }
}
