package Day04;

import java.util.Arrays;

/**
 * @ClassName ArraysDemo
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/10/23
 **/

public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray={10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1={2,1,3,10,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2={"AAA","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        String str ="aalerjaiaoinflakwjerajdflk";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        for(int i = chars.length-1;i>=0;i--){
            System.out.print(chars[i]+"  ");
        }

    }
}