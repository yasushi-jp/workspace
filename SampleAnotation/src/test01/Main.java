package test01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, SecurityException {

        // (1) クラスについているアノテーション（MyAnnotation）を取得
        Class<?> clazz = Class.forName("test01.Sample");
        MyAnnotation annoClass = (MyAnnotation) clazz.getAnnotation(MyAnnotation.class);
        System.out.println("class annotation : name=" + annoClass.name() + ", value=" + annoClass.value());

        // (2) フィールドについているアノテーション（MyAnnotation）を取得
        Field field = clazz.getDeclaredField("name");
        MyAnnotation annoField = (MyAnnotation) field.getAnnotation(MyAnnotation.class);
        System.out.println("field annotation : name=" + annoField.name() + ", value=" + annoField.value());

        // (3) コンストラクタについているアノテーション（MyAnnotation）を取得
        Constructor<?> cons = clazz.getConstructor();
        MyAnnotation annoCons = (MyAnnotation) cons.getAnnotation(MyAnnotation.class);
        System.out.println("constructor annotation : name=" + annoCons.name() + ", value=" + annoCons.value());

        // (4) メソッドについているアノテーション（MyAnnotation）を取得
        Method method = clazz.getMethod("execute");
        MyAnnotation annoMethod = (MyAnnotation) method.getAnnotation(MyAnnotation.class);
        System.out.println("method annotation : name=" + annoMethod.name() + ", value=" + annoMethod.value());

    }
}
