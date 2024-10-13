import java.lang.reflect.Method;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        for (String className : classNames) {
            // Load the class by its fully-qualified name
            Class<?> cls = Class.forName(className);

            // Get all public methods of the class, including inherited methods
            Method[] methods = cls.getMethods();

            // Check if any method has the specified name
            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    return className;  // Return the fully-qualified name of the class
                }
            }
        }

        // If no class contains the method, return null
        return null;
    }

    public static void main(String[] args) {
        try {
            // Test case
            String methodName = "abs";
            String[] classNames = {"java.lang.String", "java.lang.StringBuffer", "java.lang.Math"};
            String result = findMethod(methodName, classNames);
            System.out.println(result);  // Expected output: java.lang.Math
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
