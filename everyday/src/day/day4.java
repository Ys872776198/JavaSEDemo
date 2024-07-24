package day;

import dayclass.Day4Menu;
import dayclass.Day4_test;
import dayclass.test1;
import dayinterface.Day4Sex;
import dayinterface.Day4_test1;

/**
 * @Auther: YS
 * @Date: 2023/12/12 21:20
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class day4 {
    //    start

//    public static void main(String[] args) {
////        调用接口的常量
////        1、利用 接口名。常量名
//        System.out.println(Day4_test1.a);
//        System.out.println("-------------");
//
////        2、利用 实现类对象名。常量名
//        Day4_test da = new Day4_test();
//        System.out.println(da.a);
//        System.out.println("------------------");
//
////        3、利用多态 接口对象名。常量名
//        Day4_test1 da2 = new Day4_test();
//        System.out.println(da2.a);
//        System.out.println("-------------------");
//
////        4、利用实现类 实现类名。常量名
//        System.out.println(Day4_test.a);
//        System.out.println("---------------------");
//
//    }

    //    end

    //    start
//        创建学生管理系统，能查看学生信息和平均分
//    public static void main(String[] args) {
//
//        Day4Menu m = new Day4Menu();
//        m.classMenu();
//
//    }
    //    end

    //    start
//    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5,6,7,7,76};
//        for(int i : arr){
//            System.out.println(i);
//        }
//    }
    //    end

    //    start
//    public static void main(String[] args) {
//        cheak(Day4Sex.Boy);    //此刻要传入的是枚举类型的对象，枚举是最简单的单例设计模式，可以用 枚举类名。常量名称
//    }
//
//    public static void cheak(Day4Sex sex){
//        switch(sex){
//            case Boy:
//                System.out.println("我是男生");
//                break;
//            case Girl:
//                System.out.println("我是女生");
//                break;
//            default:
//                break;
//        }
//
//    }

    //    end

    //    start
//    1、测试饿汉和懒汉式单例设计模式
    public static void main(String[] args) {
        test1 t = test1.getTest1();
    }
    //    end

    //    start
    //    end

    //    start
    //    end

    //    start
    //    end

}
