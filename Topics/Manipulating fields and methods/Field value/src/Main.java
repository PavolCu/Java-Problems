import java.lang.reflect.Field;
/**
 * Get value for a given public field or null if the field does not exist or is not accessible.
 */

class FieldGetter {

    public Object getFieldValue(Object object, String fieldName) throws IllegalAccessException {
        try {
            Field field = object.getClass().getField(fieldName);
            return field.get(object);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return null;
        }
    }
}