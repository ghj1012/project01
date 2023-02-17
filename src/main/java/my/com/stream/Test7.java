package my.com.stream;

import my.com.entity.StudentyEntity;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Test7 {
    public static void main(String[] args) {
        /*
           计算所有学生年龄的和 求和
         */
        ArrayList<StudentyEntity> se = new ArrayList<>();
        se.add(new StudentyEntity("小明",20));
        se.add(new StudentyEntity("小红",19));
        se.add(new StudentyEntity("pob",21));

        // 创建stream流
        Stream<StudentyEntity> s = se.stream();
        // 使用stream的api求和
//        Optional<StudentyEntity> reduce = s.reduce(new BinaryOperator<StudentyEntity>() {
//            @Override
//            public StudentyEntity apply(StudentyEntity s1, StudentyEntity s2) {
//                StudentyEntity se1 = new StudentyEntity("总年龄为：",s1.getAge()+s2.getAge());
//                return se1;
//            }
//        });
//        System.out.println(reduce);

        // 修改为lambda表达式
        Optional<StudentyEntity> reduce = s.reduce((s1, s2) ->
            new StudentyEntity("总年龄为：",s1.getAge()+s2.getAge())
        );
        System.out.println(reduce);

        Optional<StudentyEntity> reduce1 = s.reduce((StudentyEntity, StudentyEntity1) -> new StudentyEntity("总年龄为：", StudentyEntity.getAge() + StudentyEntity1.getAge()));
        System.out.println(reduce1);
    }
}
