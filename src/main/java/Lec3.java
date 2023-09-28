//public class Lec3 {
//    public static void main(String[] args) {
//        Object o = 1; GetType(o);  // java.lang.Integer
//         o = 1.2; GetType (o);     // java.lang.Double
//    }
//    static void GetType(Object obj) {
//        System.out.println(obj.getClass().getName());
//    }
//}

//public class Lec3 {
//    public static void main(String[] args) {
//        int Sum; {
//            int a = 1;
//            int b = 2;
//            Sum = a + b;
//            System.out.println(Sum);
//        }
//    }
//}

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//public class Lec3 {
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
////        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(2809);
//
//        for (Object o: list) {
//            System.out.println(o);
//        }
//    }
//}

//public class Lec3 {
//    public static void main(String[] args) {
//        int day = 30;
//        int month = 3;
//        int year = 1986;
//        Integer[] date = {day, month, year};
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d);
//    }
//}

public class Lec3 {
    public static void main(String[] args) {
        List<Integer>list = List.of(1, 12, 123, 1234, 12345);

        for (int item: list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.out.println(col.next());
//            col.next();
//            col.remove();
        }
    }
}