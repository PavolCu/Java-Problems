import java.util.Scanner;

abstract class SocialNetwork {

    public void connect() {
        logIn();
        postMessage();
        logOut();
        // write your code here ...
    }

    abstract void logIn();

    abstract void postMessage();

    abstract void logOut();

    // write your code here ...

}

class Instagram extends SocialNetwork {
    @Override
    void logIn() {
        System.out.println("Log into Instagram");
    }

    @Override
    void postMessage() {
        System.out.println("Post: Hello, Instagram!");

    }

    @Override
    void logOut() {
        System.out.println("Log out of Instagram");

    }

    // write your code here ...

}


class Facebook extends SocialNetwork {
    @Override
    void logIn() {
        System.out.println("Log into Facebook");
    }

    @Override
    void postMessage() {
        System.out.println("Post: Hello, Facebook!");

    }

    @Override
    void logOut() {
        System.out.println("Log out of Facebook");

    }
    // write your code here ...
}

// Do not change the code below
class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        SocialNetwork network = null;
        if ("facebook".equalsIgnoreCase(type)) {
            network = new Facebook();
        } else if ("instagram".equalsIgnoreCase(type)) {
            network = new Instagram();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        network.connect();
    }
}