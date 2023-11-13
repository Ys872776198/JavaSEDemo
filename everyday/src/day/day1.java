package day;

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
        Random r = new Random();
        int i = (r.nextInt(60) + 20);
        System.out.println("请输入一个数：");
        int a = new Scanner(System.in).nextInt();

        while(true){
            if(i == a){
                System.out.println("你猜对了！");
                break;
            }else if(i < a){
                System.out.println("猜大了，请输入一个数：");
                a = new Scanner(System.in).nextInt();
            }else if(i > a){
                System.out.println("猜小了，请输入一个数：");
                a = new Scanner(System.in).nextInt();
            }
        }


    }
}
