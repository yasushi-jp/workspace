package test;

public class Main {
    public static void main(String[] args) {

        System.out.println("InterFace.isAssignableFrom(InterFace) = " + InterFace.class.isAssignableFrom(InterFace.class));
        System.out.println("InterFace.isAssignableFrom(SuperClass) = " + InterFace.class.isAssignableFrom(SuperClass.class));
        System.out.println("InterFace.isAssignableFrom(SubClass) = " +InterFace.class.isAssignableFrom(SubClass.class));
        System.out.println();
        System.out.println("SuperClass.isAssignableFrom(InterFace) = " + SuperClass.class.isAssignableFrom(InterFace.class));
        System.out.println("SuperClass.isAssignableFrom(SuperClass) = " + SuperClass.class.isAssignableFrom(SuperClass.class));
        System.out.println("SuperClass.isAssignableFrom(SubClass) = " +SuperClass.class.isAssignableFrom(SubClass.class));
        System.out.println();
        System.out.println("SubClass.isAssignableFrom(InterFace) = " + SubClass.class.isAssignableFrom(InterFace.class));
        System.out.println("SubClass.isAssignableFrom(SuperClass) = " + SubClass.class.isAssignableFrom(SuperClass.class));
        System.out.println("SubClass.isAssignableFrom(SubClass) = " +SubClass.class.isAssignableFrom(SubClass.class));
        System.out.println();
    }
}
