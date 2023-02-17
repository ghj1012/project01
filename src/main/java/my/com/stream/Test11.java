package my.com.stream;

import my.com.entity.StudentyEntity;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test11 {
    public static void main(String[] args) {
        ArrayList<StudentyEntity> se = new ArrayList();
        se.add(new StudentyEntity("小明",20));
        se.add(new StudentyEntity("小红",19));
        se.add(new StudentyEntity("pob",21));
        se.add(new StudentyEntity("avds",22));
        se.add(new StudentyEntity("cvzx",18));

        /*
           通过stream的limit分页 skip()跳过查找
         */
        Stream<StudentyEntity> s = se.stream();
        s.skip(1).limit(3).forEach(st -> System.out.println(st));

    }
}
