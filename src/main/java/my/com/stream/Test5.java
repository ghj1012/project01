package my.com.stream;

import my.com.entity.StudentyEntity;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<StudentyEntity> list = new ArrayList<>();
        list.add(new StudentyEntity("小明",20));
        list.add(new StudentyEntity("小红",19));
        list.add(new StudentyEntity("pob",21));
        list.add(new StudentyEntity("lucy",18));
        list.add(new StudentyEntity("xiaoxiao",20));

//        Stream<StudentyEntity> s = list.stream();
//        Map<String, StudentyEntity> c = s.collect(Collectors.toMap(new Function<StudentyEntity, String>() {
//            @Override
//            public String apply(StudentyEntity studentyEntity) {
//                return studentyEntity.getName();
//            }
//        }, new Function<StudentyEntity, StudentyEntity>() {
//            @Override
//            public StudentyEntity apply(StudentyEntity studentyEntity) {
//                return studentyEntity;
//            }
//        }));
//        c.forEach((k,v) -> System.out.println(k+":"+v));

        Stream<StudentyEntity> s = list.stream();
        Map<String, StudentyEntity> c = s.collect(Collectors.toMap(studentyEntity -> studentyEntity.getName(), studentyEntity -> studentyEntity));
        c.forEach((k,v) -> System.out.println(k+":"+v));
    }
}
