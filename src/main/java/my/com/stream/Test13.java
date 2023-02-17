package my.com.stream;

import my.com.entity.StudentyEntity;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test13 {
    public static void main(String[] args) {
        ArrayList<StudentyEntity> se = new ArrayList();
        se.add(new StudentyEntity("小明",20));
        se.add(new StudentyEntity("小红",19));
        se.add(new StudentyEntity("pob",21));
        se.add(new StudentyEntity("pob",24));
        se.add(new StudentyEntity("pob",16));
        se.add(new StudentyEntity("pob_list",23));
        se.add(new StudentyEntity("pob_zhangsan",17));
        se.add(new StudentyEntity("avds",22));
        se.add(new StudentyEntity("cvzx",18));

        // 要求：对数据流的数据进行降序排序、且名称包含pob 获取前两位
        Stream<StudentyEntity> s = se.stream();
//        s.sorted((s1,s2) -> s2.getAge()- s1.getAge()).forEach(studentyEntity -> System.out.println(studentyEntity));

//        boolean b = s.anyMatch((see) -> "pob".contains(see.getName()));
//        System.out.println(b);

//        s.limit(2).forEach(studentyEntity -> System.out.println(studentyEntity));

//        s.sorted((s1,s2) -> s2.getAge()- s1.getAge()) && s.anyMatch((see) -> "pob".contains(see.getName())) && s.limit(2);
        s.sorted((s1,s2) -> s2.getAge()- s1.getAge()).
                filter(v -> "pob".equals(v.getName())).limit(2).
                forEach(studentyEntity -> System.out.println(studentyEntity));

    }
}
