package test;

import java.util.ArrayList;
import java.util.List;

public class LambdaMain {
    public static void main(String[] args) {

        Calculation c = (x, y) -> {return (x + y);};
        System.out.println(c.add(3, 6));

        int[] numbers = {-1, 2, 0, -3, 8};

        List<Integer> numbersList = new ArrayList<>();

        for(int n : numbers) {
          numbersList.add(n);
        }

        numbersList.stream().forEach((i) -> { System.out.print(i + " "); });
    }
}
