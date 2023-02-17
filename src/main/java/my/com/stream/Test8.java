package my.com.stream;

import my.com.entity.StudentyEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<StudentyEntity> se = new ArrayList();
        se.add(new StudentyEntity("小明",20));
        se.add(new StudentyEntity("小红",19));
        se.add(new StudentyEntity("pob",21));
        se.add(new StudentyEntity("avds",22));
        se.add(new StudentyEntity("cvzx",18));

        /*
           查找年龄最大/最小的都对象
         */
        Stream<StudentyEntity> s = se.stream();
//        Optional<StudentyEntity> max = s.max(new Comparator<StudentyEntity>() {
//            @Override
//            public int compare(StudentyEntity o1, StudentyEntity o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//        System.out.println(max);


        // lambda表达式
        // 年龄最大
//        Optional<StudentyEntity> max = s.max((o1, o2) -> o1.getAge() - o2.getAge());
//        System.out.println(max);
        // 年龄最小
        Optional<StudentyEntity> min = s.min((a1,a2) -> a1.getAge() - a2.getAge());
        System.out.println(min);

    }
}
