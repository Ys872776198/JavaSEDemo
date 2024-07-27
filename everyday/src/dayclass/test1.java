package dayclass;

import javax.crypto.spec.PSource;

/**
 * @Auther: YS
 * @Date: 2024/7/24 10:34
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class test1 {

//    //    饿汉式单例设计模式（类变量已提前创建好）
//    //    2、定义类变量容器，提前创建好类变量
//    private static test1 t1 = new test1();
//
//    //    1、私有化构造器
//    private test1() {
//
//    }
//
//    //    3、提供获取方法
//    public static test1 getTest1() {
//        System.out.println("测试饿汉式单例设计模式");
//        return t1;
//    }

    //    懒汉式单例设计模式
    //    2、创建类变量容器
    private static test1 t1;

    //    1、私有化构造器
    private test1() {
    }

    //    3、提供获取方法，判断类变量是否提前创建，确保只有一个类变量
    public static test1 getTest1() {
        if (t1 == null) {
            System.out.println("测试懒汉式单例设计模式");
            t1 = new test1();
        } else {
//            do nothing
        }
        return t1;
    }
}

