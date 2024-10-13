import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LocalDate date = LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE);

        int dayOfYear = date.getDayOfYear();
        int dayOfMonth = date.getDayOfMonth();

        System.out.println(dayOfYear + " " + dayOfMonth);
    }
}