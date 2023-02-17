package my.com;

public interface JDK8Interface {
    void add();

    static void get(){
        System.out.println("hello!!!");
    }

    default void del(){
        System.out.println("删除了！");
    }
}
