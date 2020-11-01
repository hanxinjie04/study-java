package Day12;

/**
 * @ClassName TextSystem
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/11/1
 **/

public class TextSystem {
    private static final int MAX =10000;

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        long start =System.currentTimeMillis();
        for(int i=0;i<MAX;i++){
            System.out.println(i);
        }
        long end =System.currentTimeMillis();
        System.out.println("共耗时毫秒"+(end -start));
    }
}
