package my.com.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> d = Stream.of(1, 6, 9, 8, 5);
//        Optional<Integer> reduce = d.reduce(new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer a1, Integer a2) {
//                return a1+a2;
//            }
//        });
//        System.out.println(reduce);
        /*
           Lambda表达式
         */
        Optional<Integer> reduce1 = d.reduce((a1, a2) -> a1 + a2);
        System.out.println(reduce1);
    }
}
