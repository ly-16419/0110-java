package Zhichaundi;

public class Test {
    public static void main(String[] agre){
        //值的传递，不改变a的值
        int a=3;
        m1(a);
        System.out.println("aaa=" + a);
    }
    public static void m1(int a){
        a=5;
        System.out.println("ccc=" + a);
    }

}
