import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();
        scanner.close();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        if (seconds == 0) {
            System.out.printf("%02d:%02d\n", hours, minutes);
        } else {
            System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
        }
    }
}