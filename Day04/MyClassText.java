package Day04;

/**
 * @ClassName MyClassText
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/10/23
 **/

public class MyClassText {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
        MyClass.methodStatic();
        myMethod();
        MyClassText.myMethod();
    }
    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}