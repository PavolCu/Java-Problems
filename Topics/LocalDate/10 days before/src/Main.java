import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate);
        LocalDate tenDaysBefore = date.minusDays(10);
        System.out.println(tenDaysBefore);
    }
}