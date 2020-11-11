package test;

public class Main3 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> interFace = Class.forName("test.InterFace");
        Class<?> superClazz = Class.forName("test.SuperClass");
        Class<?> subClazz = Class.forName("test.SubClass");

        SuperClass superClass = new SuperClass();
        SubClass subClass = new SubClass();

        System.out.println("InterFace.isInstance(SuperClass) = " + interFace.isInstance(superClass));
        System.out.println("InterFace.isInstance(SubClass) = " +interFace.isInstance(subClass));
        System.out.println();
        System.out.println("SuperClass.isInstance(SuperClass) = " + superClazz.isInstance(superClass));
        System.out.println("SuperClass.isInstance(SubClass) = " +superClazz.isInstance(subClass));
        System.out.println();
        System.out.println("SubClass.isInstance(SuperClass) = " + subClazz.isInstance(superClass));
        System.out.println("SubClass.isInstance(SubClass) = " + subClazz.isInstance(subClass));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("superClass instanceof SuperClass = " + (superClass instanceof SuperClass));
        System.out.println("superClass instanceof SubClass = " + (superClass instanceof SubClass));
        System.out.println();
        System.out.println("subClass instanceof SuperClass = " + (subClass instanceof SuperClass));
        System.out.println("subClass instanceof SubClass = " + (subClass instanceof SubClass));
        System.out.println();

    }
}
