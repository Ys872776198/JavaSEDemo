package day;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: YS
 * @Date: 2023/11/8 22:49
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class day1 {
    public static void main(String[] args) {
//        System.out.println("hello world!");

//        Scanner sc = new Scanner(System.in);

//        int a = new Scanner(System.in).nextInt();

//        猜数游戏（20---80）
//
//        Random r = new Random();
//        int i = (r.nextInt(60) + 20);
//        System.out.println("请输入一个数：");
//        int a = new Scanner(System.in).nextInt();
//
//        while(true){
//            if(i == a){
//                System.out.println("你猜对了！");
//                break;
//            }else if(i < a){
//                System.out.println("猜大了，请输入一个数：");
//                a = new Scanner(System.in).nextInt();
//            }else if(i > a){
//                System.out.println("猜小了，请输入一个数：");
//                a = new Scanner(System.in).nextInt();
//            }
//        }

//        for(int i = 0; i < 5; i++){
//
//            if(i == 2){
//                continue;
//            }else {
////                do nothing
//            }
//
//            System.out.println(i);
//
//        }

//        int[] v = {12,313,4242,424242,2442};
//        for (int i : v){
//            System.out.println(i);
//        }
////        循环快捷键     变量.fori(v.fori)
//        int temp = 0; //暂存
//        int min = 0; //最小值
//
//        for(int i = 0; i < (v.length - 1); i++){
//            min = i;
//
//            for(int j = (i+1); j < v.length; j++){
////                找出最小值
//                if (v[min] > v[j]){
//                    min = j;
//                }else {
////                    no thing
//                }
//            }
//
////            数据交换
//            if (i != min){
//                temp = v[i];
//                v[i] = v[min];
//                v[min] = temp;
//            }else {
////                no thing
//            }
//
//        }
//
//        System.out.println(Arrays.toString(v));
        fenJiOu(9);

    }

    public static void fenJiOu(int num){
        if((num % 2) == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }


}
