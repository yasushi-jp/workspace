package test01;

@MyAnnotation(name="class", value=100)              // (1) クラスにMyAnnotationを付与
public class Sample {

    @MyAnnotation(name="field", value=200)          // (2) フィールドにMyAnnotationを付与
    private String name;

    @MyAnnotation(name="constructor", value=300)    // (3) コンストラクタにMyAnnotationを付与
    public Sample() {}

    @MyAnnotation(name="method", value=400)         // (4) メソッドにMyAnnotationを付与
    public void execute() {
        System.out.println("execute");
    }
}
