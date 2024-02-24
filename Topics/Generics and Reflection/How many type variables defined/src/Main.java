// Do not remove imports
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.Scanner;

class TypeVariablesInspector {
    public void printTypeVariablesCount(TestClass obj, String methodName) throws Exception {
        Class<?> clazz = obj.getClass();
        Method method = clazz.getDeclaredMethod(methodName);
        TypeVariable<?>[] typeParameters = method.getTypeParameters();
        System.out.println(typeParameters.length);
    }
}