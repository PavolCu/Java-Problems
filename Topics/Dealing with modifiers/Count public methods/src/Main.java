import java.lang.reflect.Method;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class ReflectionUtils {

    public static int countPublicMethods(Class targetClass) {
        Method[] methods = targetClass.getDeclaredMethods();
        long count = 0;
        for (Method method : methods) {
            if (Modifier.isPublic(method.getModifiers())) {
                count++;
            }
        }
        return (int) count;
    }
}