import java.util.Scanner;
public class TwoLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 9) + 1; // Генерация случайного числа от 1 до 9
        int guess;

        System.out.println("Программа загадала число от 1 до 9. Попробуйте угадать!");

        while (true) {
            System.out.print("Введите ваше число (или 0 для выхода): ");
            guess = scanner.nextInt();

            if (guess == 0) {
                System.out.println("Выход из программы");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Загаданное число больше");
            } else if (guess > randomNumber) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}
