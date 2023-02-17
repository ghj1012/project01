package my.com.stream;

import my.com.entity.StudentyEntity;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StudentyEntity> se = new ArrayList();
        se.add(new StudentyEntity("小明",20));
        se.add(new StudentyEntity("小红",19));
        se.add(new StudentyEntity("pob",21));
        se.add(new StudentyEntity("lucy",18));
        se.add(new StudentyEntity("xiaoxiao",20));
        se.add(new StudentyEntity("xiaoxiao",20));

        Stream<StudentyEntity> s = se.stream();
        Set<StudentyEntity> c = s.collect(Collectors.toSet());
        c.forEach(v -> System.out.println(v));
    }
}
