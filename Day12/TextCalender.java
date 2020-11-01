package Day12;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName TextCalender
 * @Description TODO
 * @Author 韩辛杰
 * @Date 2020/11/1
 **/

public class TextCalender {

        public static void main(String[] args) {
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            int mouth = cal.get(Calendar.MONTH)+1;
            int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
            System.out.println(year+"年"+mouth+"月"+dayOfMonth+"日");
            Calendar cal1 = Calendar.getInstance();
            cal1.set(Calendar.YEAR,2020);

            System.out.println(year+"年"+mouth+"月"+dayOfMonth+"日");

            Calendar cal2 = Calendar.getInstance();
            System.out.println(year+"年"+mouth+"月"+dayOfMonth+"日");

            cal2.add(Calendar.DAY_OF_MONTH,2);
            cal2.add(Calendar.YEAR,-3);
            System.out.println(year+"年"+mouth+"月"+dayOfMonth+"日");

            Calendar cal3 = Calendar.getInstance();

            Date date =cal3.getTime();
            System.out.println(date);

        }
    }


