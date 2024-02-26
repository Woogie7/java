import java.util.Scanner;
public class FiveLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите достоинство карты (6-14): ");
        int N = scanner.nextInt();
        System.out.print("Введите масть карты (1-4): ");
        int M = scanner.nextInt();

        String cardName = getCardName(N, M);
        if (cardName != null) {
            System.out.println("Название карты: " + cardName);
        } else {
            System.out.println("Ошибка: некорректные данные");
        }
    }

    public static String getCardName(int value, int suit) {
        if (value < 6 || value > 14 || suit < 1 || suit > 4) {
            return null;
        }

        String valueName;
        if (value >= 6 && value <= 10) {
            valueName = String.valueOf(value);
        } else {
            switch (value) {
                case 11:
                    valueName = "валет";
                    break;
                case 12:
                    valueName = "дама";
                    break;
                case 13:
                    valueName = "король";
                    break;
                case 14:
                    valueName = "туз";
                    break;
                default:
                    return null;
            }
        }

        String suitName;
        switch (suit) {
            case 1:
                suitName = "пики";
                break;
            case 2:
                suitName = "трефы";
                break;
            case 3:
                suitName = "бубны";
                break;
            case 4:
                suitName = "черви";
                break;
            default:
                return null;
        }

        return valueName + " " + suitName;
    }
}
