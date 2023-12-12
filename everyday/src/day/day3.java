package day;


import dayclass.ATM;
import dayclass.Food;
import dayclass.FoodOperator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Auther: YS
 * @Date: 2023/12/10 22:13
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class day3 {
//    验证密码
//    public static void main(String[] args) {
//        //正确账号
//        String s = "ys";
//        //正确密码
//        int ma = 123;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("请输入账号：");
//        String s1 = sc.next();
//
//        System.out.println("请输入密码：");
//        int a = sc.nextInt();
//
//        for(int i = 0; i < 3; i++){
//            if((s1.equals(s)) && (a == ma)){
//                System.out.println("密码正确");
//                break;
//            }else {
//                System.out.println("密码错误");
//                System.out.println("请输入账号：");
//                s1 = sc.next();
//
//                System.out.println("请输入密码：");
//                a = sc.nextInt();
//               }
//       }
//    }

    //Arraylist集合，批量删除功能
//    public static void main(String[] args) {
//        ArrayList<String> a1 = new ArrayList<>();
//
//        a1.add("java入门");
//        a1.add("宁夏枸杞");
//        a1.add("黑枸杞");
//        a1.add("人字拖");
//        a1.add("超级枸杞");
//        a1.add("枸杞子");
//
//        System.out.println("请输入要删除的指定信息：");
//        String s1 = new Scanner(System.in).next();

//        遍历集合
//        1、普通for循环（容易曝空指针异常 IndexOutOfBoundsException，原因查询和删除同步进行，会实时改变集合长度）
//        for(int i = 0; i < a1.size(); i++){
//            if(a1.get(i).contains(s1)){
//                a1.remove(i);
//            }else {
////                no thing
//            }
//            System.out.println(a1.get(i));
//        }

//        2、增强for循环（容易出现并发修改异常 ConcurrentModificationException，原因查询和删除再同时进行）
//        for(String s : a1){
//            if(s.contains(s1)){
//                a1.remove(s);
//            }else{
////                no thing
//            }
//
//            System.out.println(s);
//        }

//        3、迭代器
//        Iterator<String> it = a1.iterator();
//        while(it.hasNext()){
//            String b = it.next();
//            if(b.contains(s1)){
//                a1.remove(b);
//            }else{
////                no thing
//            }
//
////            System.out.println(it.next());
//        }
//
//    }

    //完成菜品上架，以及菜品信息浏览
//    public static void main(String[] args) {
//        FoodOperator fo = new FoodOperator();
//
//        fo.foodMenu();
//    }


    //ATM系统
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.atmMenu();
    }


    //

}
