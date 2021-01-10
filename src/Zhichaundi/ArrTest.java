package Zhichaundi;

public class ArrTest {
    public static void main(String[] agre){
        //引用传递
        int[] a=new int[]{1,2,3};
        m1(a);
        for (int i=0;i<a.length;i++){
            System.out.println("a[" + i + "]" + a[i]);
        }
    }
    public static void m1(int[] a){
        a[2]=98;
        for (int i=0;i<a.length;i++){
            System.out.println("a[" + i + "]" + a[i]);
        }
    }

}