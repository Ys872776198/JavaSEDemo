package day;

import dayclass.Day4_test;
import dayinterface.Day4_test1;

/**
 * @Auther: YS
 * @Date: 2023/12/12 21:20
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class day4 {
    //    start

    public static void main(String[] args) {
//        调用接口的常量
//        1、利用 接口名。常量名
        System.out.println(Day4_test1.a);
        System.out.println("-------------");

//        2、利用 实现类。常量名
        Day4_test da = new Day4_test();
        System.out.println(da.a);
        System.out.println("------------------");

//        3、利用多态 接口对象名。常量名
        Day4_test1 da2 = new Day4_test();
        System.out.println(da2.a);
        System.out.println("-------------------");

//        4、利用实现类 实现类名。常量名
        System.out.println(Day4_test.a);
        System.out.println("---------------------");

    }

    //    end

    //    start
    //    end

    //    start
    //    end

    //    start
    //    end

    //    start
    //    end

    //    start
    //    end

    //    start
    //    end

    //    start
    //    end

}
