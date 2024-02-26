import java.util.Scanner;
public class sixLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер года: ");
        int year = scanner.nextInt();

        String[] colors = {"зеленый", "красный", "желтый", "белый", "голубой"};
        String[] animals = {"крысы", "коровы", "тигра", "зайца", "дракона", "змеи",
                "лошади", "овцы", "обезьяны", "петуха", "собаки", "свиньи"};

        int colorIndex = (year - 4) % 60 / 2; // Определение индекса цвета
        int animalIndex = (year - 4) % 12;    // Определение индекса животного

        String currentYear = colors[colorIndex] + " " + animals[animalIndex];
        System.out.println("Текущий год: " + currentYear);

        System.out.println("Ближайшие годы:");
        for (int i = year - 2; i <= year + 2; i++) {
            int currentColorIndex = (i - 4) % 60 / 2;
            int currentAnimalIndex = (i - 4) % 12;
            String currentColor = colors[currentColorIndex];
            String currentAnimal = animals[currentAnimalIndex];
            System.out.println(i + ": " + currentColor + " " + currentAnimal);
        }
    }
}
