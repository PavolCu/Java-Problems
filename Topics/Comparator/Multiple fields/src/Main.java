import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "=" + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Utils {

    public static void sortUsers(List<User> users) {
        // your code here
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                int nameCompare = u1.getName().compareTo(u2.getName());
                int ageCompare = Integer.compare(u2.getAge(), u1.getAge());

                if (nameCompare == 0) {
                    return ageCompare;
                } else {
                    return nameCompare;
                }
            }
        });
    }
}