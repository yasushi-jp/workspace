package test01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)     // (1) @Retantionでアノテーション情報をどの段階まで保持するかを制御
@Target({                               // (2) @Targetどのようなタイプの要素に対して、そのアノテーションを付加できるのかを制御
    ElementType.TYPE,
    ElementType.FIELD,
    ElementType.CONSTRUCTOR,
    ElementType.METHOD
})
public @interface MyAnnotation {        // (3) MyAnnotationを作成
    String name();
    int value() default 0;
}
