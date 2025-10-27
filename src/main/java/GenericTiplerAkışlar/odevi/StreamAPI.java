package GenericTiplerAkışlar.odevi;

import java.util.*;
import java.util.function.Predicate;

public class StreamAPI {


    public static <T> T findFirstMatch(List<T> list, Predicate<T> condition) {

        return list.stream()
                .filter(condition)
                .findFirst()
                .orElse((T)(Integer)(-1));
    }

    public static void main(String[] args) {
        List<Integer> sayilar = Arrays.asList(3, 7, 1, 15, 9);


        Predicate<Integer> ciftMi = x -> x % 2 == 0;

        Integer sonuc = findFirstMatch(sayilar, ciftMi);

        System.out.println(sonuc);
    }
}
