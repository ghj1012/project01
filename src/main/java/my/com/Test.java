package my.com;

import my.com.service.OrderService;

public class Test {
    public static void main(String[] args) {
        JDK8InterfaceImpl ji = new JDK8InterfaceImpl();
        ji.add();
        ji.del();
        JDK8Interface.get();

//        new OrderService() {
//            @Override
//            public void get() {
//
//            }
//        }.get();
        ((OrderService) ()-> System.out.println("nihao!")).get();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName()+"run");
//            }
//        }).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName()+"run")).start();
    }
}
