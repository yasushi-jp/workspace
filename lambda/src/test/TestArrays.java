package test;

import java.util.Arrays;
import java.util.List;

public class TestArrays {

    public static void main(String[] args) {

        String[] strs = {"01", "02", "03", "04"};

        List<String> list = Arrays.asList(strs);

        System.out.println("リスト（list）の中身");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println();

        System.out.println("リスト（list）の2番目に99を設定");
        list.set(1, "99");

        System.out.println("リスト（list）の中身");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println();

        System.out.println("配列（strs）の中身");
        for (String str : strs) {
            System.out.println(str);
        }
        System.out.println();

        
    }
}
