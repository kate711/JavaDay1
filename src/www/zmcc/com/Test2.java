package www.zmcc.com;

public class Test2 {
    static int x;
    static int sum;
    static int i;
    static int aa;

    public static void main(String[] args) {
        System.out.println("Value is " + x);
        System.gc();

        while(i< 100) {
            sum = sum + i;
            if (sum == 2000) {

                aa = sum + 100;
                sum = 0;
            }
        }

    }
}

/**
 *
 */

class MyClass {

    int age;
    int id;
    String name;

}

class MyClass1 {
    /**
     *  Private,protected,public
     *
     */
//     public  public abstract,class,extends,final,implements,interface,native,new,static,strictfp,synchronized,
//        transient,volatile,
//
//        break,continue,return,do,while,if,else,for,instanceof,switch,case,default
//
//        catch,finally,throw,throws,try
//
//        import,package
//
//        boolean,byte,char,double,float,int,long,short,null,true,false
//
//        super,this,void
//

}






























