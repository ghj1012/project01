package my.com.stream;

import my.com.entity.StudentyEntity;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<StudentyEntity> se = new ArrayList();
        se.add(new StudentyEntity("小明",20));
        se.add(new StudentyEntity("小红",19));
        se.add(new StudentyEntity("pob",21));
        se.add(new StudentyEntity("avds",22));
        se.add(new StudentyEntity("cvzx",18));
        se.add(new StudentyEntity("小明",18));

        /*
           通过过滤查找对象中匹配的数据 用到stream中的filter()
         */
        Stream<StudentyEntity> s = se.stream();
//        s.filter(new Predicate<StudentyEntity>() {
//            @Override
//            public boolean test(StudentyEntity studentyEntity) {
//                return "小明".equals(studentyEntity.getName()) && studentyEntity.getAge()>18;
//            }
//        }).forEach((studentyEntity -> System.out.println(studentyEntity)));

        s.filter((st) ->
                "小明".equals(st.getName()) && st.getAge()>18
                ).forEach(studentyEntity -> System.out.println(studentyEntity));

    }
}
