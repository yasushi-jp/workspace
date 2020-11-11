package test;

public class Recursive {

    public static boolean containsException(Class<?> clazz, Throwable cause) {
        if (cause == null) {
            return false;
        } else if (clazz.isInstance(cause)) {
            return true;
        } else {
            return containsException(clazz, cause.getCause());
        }
    }
}
