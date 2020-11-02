package Day13;

/**
 * @ClassName RegexText
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/11/2
 **/

public class RegexText {
    public static void main(String[] args) {
        String qq1 = "6549846513216";
        String qq2 = "123";
        String qq3 = "291809733";
        String qq4="0123456";
        boolean b1 = isQq(qq1);
        boolean b2 = isQq(qq2);
        boolean b3 = isQq(qq3);
        boolean b4 = isQq(qq4);
        System.out.println(qq1 + "是qq号吗\n"+b1);
        System.out.println(qq2 + "是qq号吗\n"+b2);
        System.out.println(qq3 + "是qq号吗\n"+b3);
        System.out.println(qq4 + "是qq号吗\n"+b4);

    }

    public static boolean isQq(String qq){
        String regex = "[1-9][0-9]{4,10}";
        return qq.matches(regex);
    }
}
