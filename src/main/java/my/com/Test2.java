package my.com;

import my.com.service.LambdaDemo2;

public class Test2 {
    public static void main(String[] args) {
        new LambdaDemo2(){
            @Override
            public String get(int a, int b) {
                return a+";"+b;
            }
        }.get(1,5);

        System.out.println(((LambdaDemo2) (a, b) -> a +";"+ b ).get(1,5));
//        ((LambdaDemo2) (a,b)->{return a+b+"";}).get(1,5);
    }
}
