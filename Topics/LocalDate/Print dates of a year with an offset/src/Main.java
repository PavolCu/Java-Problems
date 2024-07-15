import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the start date from the first line
        String dateInput = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(dateInput);

        // Read the offset from the second line
        String offsetInput = scanner.nextLine();
        int offset = Integer.parseInt(offsetInput);

        int startYear = startDate.getYear();

        while (startDate.getYear() == startYear) {
            System.out.println(startDate);
            startDate = startDate.plusDays(offset);
        }

        scanner.close();
    }
}
