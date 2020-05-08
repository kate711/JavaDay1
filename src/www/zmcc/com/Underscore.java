package www.zmcc.com;

public class Underscore {

    public static void main(String[] args) {
        Underscore d = new Underscore();
                d.test();
    }

    private void test() {
        System.out.println(2_000_000);   //输出 200000
        double d1 = 128_12.1_2;
        int d2 = 15_3__1;
        System.out.println(d1);          //输出 12812.12
        System.out.println(d2);          //输出 1531

    }
}
