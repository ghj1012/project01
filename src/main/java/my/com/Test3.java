package my.com;

import my.com.entity.StudentyEntity;

import java.util.ArrayList;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StudentyEntity> se = new ArrayList();
        se.add(new StudentyEntity("小明",20));
        se.add(new StudentyEntity("小红",19));
        se.add(new StudentyEntity("pob",21));
//        se.forEach(new Consumer<StudentyEntity>() {
//            @Override
//            public void accept(StudentyEntity studentyEntity) {
//                System.out.println(studentyEntity);
//            }
//        });
        se.forEach(studentyEntity -> System.out.println(studentyEntity));
//        for (StudentyEntity ses:se) {
//            System.out.println(ses);
//        }
        System.out.println("--------------------------------------");
        se.sort(new Comparator<StudentyEntity>() {
            @Override
            public int compare(StudentyEntity o1, StudentyEntity o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        se.forEach(s -> System.out.println(s));
    }
}
