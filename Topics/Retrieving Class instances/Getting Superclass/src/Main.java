
class SuperClassGetter {

    public Class<?> getSuperClassByName(String name) throws ClassNotFoundException {
        var clazz = Class.forName(name);
        return clazz.getSuperclass();
    }

    public Class<?> getSuperClassByInstance(Object object) {
        var clazz = object.getClass();
        return clazz.getSuperclass();
    }
}