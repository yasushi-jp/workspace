package test;

public class Main {
    public static void main(String[] args) {
        ClassNotFoundException classNotFoundException = new ClassNotFoundException();
        NullPointerException nullPointerException = new NullPointerException();
        IllegalStateException illegalStateException = new IllegalStateException(nullPointerException);

        System.out.println(Recursive.containsException(ClassNotFoundException.class, classNotFoundException));
        System.out.println(Recursive.containsException(ClassNotFoundException.class, nullPointerException));
        System.out.println(Recursive.containsException(ClassNotFoundException.class, illegalStateException));
        System.out.println();
        System.out.println(Recursive.containsException(NullPointerException.class, classNotFoundException));
        System.out.println(Recursive.containsException(NullPointerException.class, nullPointerException));
        System.out.println(Recursive.containsException(NullPointerException.class, illegalStateException));
        System.out.println();
        System.out.println(Recursive.containsException(IllegalStateException.class, classNotFoundException));
        System.out.println(Recursive.containsException(IllegalStateException.class, nullPointerException));
        System.out.println(Recursive.containsException(IllegalStateException.class, illegalStateException));
    }
}
