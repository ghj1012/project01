package my.com.stream;

import my.com.entity.StudentyEntity;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<StudentyEntity> se = new ArrayList();
        se.add(new StudentyEntity("小明",20));
        se.add(new StudentyEntity("小红",19));
        se.add(new StudentyEntity("pob",21));
        se.add(new StudentyEntity("avds",22));
        se.add(new StudentyEntity("cvzx",18));

        /*
          判断集合中是否包含了这条数据，包含返回true反之返回false
         */
        Stream<StudentyEntity> s = se.stream();
//        boolean d = s.anyMatch(new Predicate<StudentyEntity>() {
//            @Override
//            public boolean test(StudentyEntity studentyEntity) {
//                return "小红".equals(studentyEntity.getName());
//            }
//        });
//        System.out.println(d);

        boolean b = s.anyMatch((v) -> "小明".equals(v.getName()));
        System.out.println(b);


    }
}
