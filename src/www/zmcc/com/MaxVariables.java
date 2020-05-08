package www.zmcc.com;

/**
 *  各种数据类型的最大值程序
 */

public class MaxVariables {

    public static void main(String[] args) {
        byte largestByte = Byte.MAX_VALUE;        //定义一个byte类型的变量
        short largestShort = Short.MAX_VALUE;     //定义一个short类型的变量
        int largestInt = Integer.MAX_VALUE;
        long largestLong = Long.MAX_VALUE;
        float largestFloat = Float.MAX_VALUE;
        double largestDouble = Double.MAX_VALUE;

        char aChar = 'C';
        boolean aBoolean = true;

        System.out.println("最大的byte值是：" + largestByte);
        System.out.println("最大的Short值是：" + largestShort);
        System.out.println("最大的Int值是：" + largestInt);
        System.out.println("最大的Long值是：" + largestLong);
        System.out.println("最大的Float值是：" + largestFloat);
        System.out.println("最大的Double值是：" + largestDouble);


        if (Character.isUpperCase(aChar)){
            System.out.println("字符" + aChar + "是大写的字符");

        }
        else {
            System.out.println("字符" + aChar + "是小写的字符");
        }
        System.out.println("布尔类型的变量值是：" + aBoolean);

    }
}
