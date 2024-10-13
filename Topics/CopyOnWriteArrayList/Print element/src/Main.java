import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Scanner;


class UseCopyOnWriteArrayList {

    public static void printElement(int n) throws InterruptedException {

        CopyOnWriteArrayList<Integer> onWriteArrayList = new CopyOnWriteArrayList<>();

        Thread writer1 = new Thread(() -> Main.addNumbers(onWriteArrayList));
        Thread writer2 = new Thread(() -> Main.removeNumbers(onWriteArrayList));

        writer1.start();
        writer2.start();

        writer1.join();
        writer2.join();

        System.out.println(onWriteArrayList.get(n));
    }
}

public class Main {

    private static final int ADD_LIMIT = 100_000;
    private static final int REMOVE_LIMIT = 50_000;

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        UseCopyOnWriteArrayList.printElement(n);
    }

    public static void addNumbers(CopyOnWriteArrayList<Integer> list) {
        for (int i = 0; i <= ADD_LIMIT; i++) {
            list.add(i);
        }
    }

    public static void removeNumbers(CopyOnWriteArrayList<Integer> list) {
        int index = 0;
        while (index <= REMOVE_LIMIT) {
            if (!list.isEmpty()) {
                list.remove(0);
                index++;
            }
        }

    }
}