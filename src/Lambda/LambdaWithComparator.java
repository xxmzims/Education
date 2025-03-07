package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaWithComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dima");
        list.add("maksim");
        list.add("kira");
        list.add("l");

        // вместо компаратора можем использовать лямбда-выражение
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
