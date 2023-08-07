import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядковый номер месяца (от 1 до 12): ");
        int monthNumber = scanner.nextInt();

        Season seasons = new Season();
        seasons.findSeason(monthNumber);
    }
}