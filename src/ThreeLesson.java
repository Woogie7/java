import java.util.Scanner;
public class ThreeLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int mid;
        int answer;

        System.out.println("Загадайте число от 1 до 100. Я попытаюсь угадать его.");

        while (true) {
            mid = (low + high) / 2;
            System.out.println("Число равно " + mid + "? (0 - НЕТ, 1 - ДА)");
            answer = scanner.nextInt();
            if (answer == 1) {
                System.out.println("Ура! Я угадал число.");
                break;
            } else {
                System.out.println("Число больше " + mid + "? (0 - НЕТ, 1 - ДА)");
                answer = scanner.nextInt();
                if (answer == 1) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
    }
}
