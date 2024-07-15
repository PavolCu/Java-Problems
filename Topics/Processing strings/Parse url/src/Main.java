import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        //System.out.println("Enter URL:");
        String urlString = inputScanner.nextLine(); // Read URL from user input

        try {
            URL url = new URL(urlString);
            String query = url.getQuery();
            Scanner queryScanner = new Scanner(query);
            queryScanner.useDelimiter("&");

            Map<String, String> parameters = new LinkedHashMap<>();
            String passwordValue = null;

            while (queryScanner.hasNext()) {
                String[] keyValue = queryScanner.next().split("=");
                String key = keyValue[0];
                String value = keyValue.length > 1 ? keyValue[1] : "not found";
                parameters.put(key, value);

                if ("pass".equals(key)) {
                    passwordValue = value;
                }
            }

            // Print parameters
            parameters.forEach((key, value) -> System.out.println(key + " : " + value));
            if (passwordValue != null) {
                System.out.println("password : " + passwordValue);
            }

            queryScanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inputScanner.close();
        }
    }
}