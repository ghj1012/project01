package my.com;

import my.com.service.LambdaDemo1;

public class Test1 {
    public static void main(String[] args) {
//        LambdaDemo1 lambdaDemo1 = new LambdaDemo1() {
//            @Override
//            public void get() {
//
//            }
//        };
//        lambdaDemo1.get();
        ((LambdaDemo1)()-> System.out.println("get")).get();

    }
}
