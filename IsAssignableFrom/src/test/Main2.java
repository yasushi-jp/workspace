package test;

public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> interFace = Class.forName("test.InterFace");
        Class<?> superClazz = Class.forName("test.SuperClass");
        Class<?> subClazz = Class.forName("test.SubClass");

        System.out.println("InterFace.isAssignableFrom(InterFace) = " + interFace.isAssignableFrom(interFace));
        System.out.println("InterFace.isAssignableFrom(SuperClass) = " + interFace.isAssignableFrom(superClazz));
        System.out.println("InterFace.isAssignableFrom(SubClass) = " +interFace.isAssignableFrom(subClazz));
        System.out.println();
        System.out.println("SuperClass.isAssignableFrom(InterFace) = " + superClazz.isAssignableFrom(interFace));
        System.out.println("SuperClass.isAssignableFrom(SuperClass) = " + superClazz.isAssignableFrom(superClazz));
        System.out.println("SuperClass.isAssignableFrom(SubClass) = " +superClazz.isAssignableFrom(subClazz));
        System.out.println();
        System.out.println("SubClass.isAssignableFrom(InterFace) = " + subClazz.isAssignableFrom(interFace));
        System.out.println("SubClass.isAssignableFrom(SuperClass) = " + subClazz.isAssignableFrom(superClazz));
        System.out.println("SubClass.isAssignableFrom(SubClass) = " + subClazz.isAssignableFrom(subClazz));
        System.out.println();
    }
}
