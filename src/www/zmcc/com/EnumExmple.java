package www.zmcc.com;


/**
 * Description: 枚举类型实例
 */

public class EnumExmple {

    public EnumExmple(){
        super();
    }

    public enum MyColors{
        Red,black,blue,green,yellow,red
    }

    public enum schoolmate_list{
        天峰,李少恒,冯艳娜,马少华,杨深港,张娟,亚婷,培英,慧明,杜承宁
    }

    private static MyColors Red;

    public static void main(String[] args) {
        MyColors color = MyColors.Red;
        switch (color){
            case Red:
                System.out.println("best color is " + color.Red);
                break;
            case black:
                System.out.println("NO" + color.black);
                break;
            default:
                System.out.println("What");
                break;

        }
        for (MyColors option : color.values()){
            System.out.println("得到的值为：" + option);
        }
        schoolmate_list list = schoolmate_list.杜承宁;
        for (schoolmate_list option : list.values()){
            System.out.println("姓名：" + option);
        }

    }


}
