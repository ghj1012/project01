package my.com.stream;

import my.com.entity.StudentyEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Test12 {
    public static void main(String[] args) {
        /*
            stream排序
         */
        ArrayList<StudentyEntity> se = new ArrayList();
        se.add(new StudentyEntity("小明",20));
        se.add(new StudentyEntity("小红",19));
        se.add(new StudentyEntity("pob",21));
        se.add(new StudentyEntity("avds",22));
        se.add(new StudentyEntity("cvzx",18));

        Stream<StudentyEntity> s = se.stream();
        // 通过年龄排序
//        s.sorted(new Comparator<StudentyEntity>() {
//            @Override
//            public int compare(StudentyEntity o1, StudentyEntity o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        }).forEach(ss -> System.out.println(ss));

        s.sorted((a1,a2) -> a1.getAge()-a2.getAge()).forEach(a -> System.out.println(a));


    }
}
