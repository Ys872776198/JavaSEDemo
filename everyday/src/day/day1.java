package day;

import dayclass.Day;

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
//    public static void main(String[] args) {
////        System.out.println("hello world!");
//
////        Scanner sc = new Scanner(System.in);
//
////        int a = new Scanner(System.in).nextInt();
//
////        猜数游戏（20---80）
////
////        Random r = new Random();
////        int i = (r.nextInt(60) + 20);
////        System.out.println("请输入一个数：");
////        int a = new Scanner(System.in).nextInt();
////
////        while(true){
////            if(i == a){
////                System.out.println("你猜对了！");
////                break;
////            }else if(i < a){
////                System.out.println("猜大了，请输入一个数：");
////                a = new Scanner(System.in).nextInt();
////            }else if(i > a){
////                System.out.println("猜小了，请输入一个数：");
////                a = new Scanner(System.in).nextInt();
////            }
////        }
//
////        for(int i = 0; i < 5; i++){
////
////            if(i == 2){
////                continue;
////            }else {
//////                do nothing
////            }
////
////            System.out.println(i);
////
////        }
//
//        int[] v = {12,313,4242,424242,2442};
////        for (int i : v){
////            System.out.println(i);
////        }
//////        循环快捷键     变量.fori(v.fori)
////        int temp = 0; //暂存
////        int min = 0; //最小值
////
////        for(int i = 0; i < (v.length - 1); i++){
////            min = i;
////
////            for(int j = (i+1); j < v.length; j++){
//////                找出最小值
////                if (v[min] > v[j]){
////                    min = j;
////                }else {
//////                    no thing
////                }
////            }
////
//////            数据交换
////            if (i != min){
////                temp = v[i];
////                v[i] = v[min];
////                v[min] = temp;
////            }else {
//////                no thing
////            }
////
////        }
////
////        System.out.println(Arrays.toString(v));
//        fenJiOu(8);
//
////        String a = "a";
////        String b = "b";
////
////        if(a.equals(b)){
////            System.out.println("true");
////        }else{
////            System.out.println("false");
////        }
//
////        发射武器（重写示例）
////        faSheWuQi("日本", 10);
////        faSheWuQi("日本");
////        faSheWuQi();
//
////        int a = 0;
////        int b = 2;
////        int c = 0;
////        while(!(a - b == c)){
////            System.out.println("false");
////            break;
////        }
//
//
//    }
//
////    发射武器
////    public static void faSheWuQi(){
////        System.out.println("发射武器");
////    }
////
////    public static void faSheWuQi(String s ){
////        System.out.println("向" + s + "发射武器");
////        return;
////    }
////
////    public static void faSheWuQi(String s, int a){
////        System.out.println("向" + s + "发射" + a + "枚武器");
////    }
//
//
//
//
//    public static void fenJiOu(int num){
//        if((num % 2) == 0){
//            System.out.println("偶数");
//            return;
//        }else {
//            System.out.println("奇数");
//        }
//        System.out.println("没了，憨批");
//    }


//    计算飞机票价格
//    public static void main(String[] args) {
//        System.out.println("请输入月份：");
//        Scanner sc = new Scanner(System.in);
//        int p = sc.nextInt();
//
//        System.out.println("请输入选择机票类型");
//        String s = sc.next();
//
//        buyJiPiao(p, s);
//
//
//    }

//    买机票
//    public static void buyJiPiao(int a, String s){
//        if((a >= 5) && (a <= 10)){
//            if(s.equals("头等舱")){
//                System.out.println("现在是旺季，头等舱9折");
//            }else if (s.equals("经济舱") ){
//                System.out.println("现在是旺季，经济舱8.5折");
//            }else{
//                System.out.println("选择错误");
//            }
//        }else {
//            if(s.equals("头等舱")){
//                System.out.println("现在是淡季，头等舱7折");
//            }else if (s.equals("经济舱") ){
//                System.out.println("现在是淡季，经济舱6.5折");
//            }else{
//                System.out.println("选择错误");
//            }
//        }
//    }
//    end


//    来发验证码
//    public static void main(String[] args) {
//        System.out.println("请输入验证码位数：");
//        int a = new Scanner(System.in).nextInt();
//
//        yanZhengMa(a);
//
//    }
//
//    public static void yanZhengMa(int a){
//        String s = "";
//        for (int i = 0; i < a; i++) {
//            int r = new Random().nextInt(3);
//            s = shuiJi(r, s);
//        }
//        System.out.println("验证码：" + s);
//    }
//
//    public static String shuiJi(int r, String s ){
//        if(r == 0){
////            随机数字
//            int a = new Random().nextInt(10);
//            s += a;
//        }else if(r == 1){
////            随机大写字母
//            char a = (char) (new Random().nextInt(25) + 65);
//            s += a;
//        }else if(r == 2){
//            char a = (char) (new Random().nextInt(25) + 97);
//            s += a;
//        }else{
////            no thing
//        }
//
//        return s;
//    }

//    end

//    计算评分
//    public static void main(String[] args) {
//        System.out.println("请输入评委数量；");
//        int a = new Scanner(System.in).nextInt();
//        pingFen(a);
//    }
//
//    public static void pingFen(int a ){
//        int[] arr = new int[a];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.print("请第" + (i + 1) + "位评委评分：");
//            arr[i] = sc.nextInt();
//        }
//
//        jiSuan(arr);
//
//    }
//
//    public static void jiSuan(int[] a){
////        排序
//        Arrays.sort(a);
//
//        int min = a[0];
//        int max = a[a.length - 1];
//        int sum = 0;
//
//        for(int s : a){
//            sum += s;
//        }
//
//        System.out.println("最终评分：" +(1.0 * (sum - min - max) / (a.length - 2)));
//    }
//
//    end

//    数字加密
//    public static void main(String[] args) {
//        int[] arr = new int[4];
//        for(int i = 0; i < 4; i++){
//            System.out.println("请输入一个数字密码：");
//            arr[i] = new Scanner(System.in).nextInt();
//        }
//
//        System.out.println("test数据：" + Arrays.toString(arr));
//        jieMi(jiaMi(arr));
//
//
//    }
//
////    加密操作
//    public static int[] jiaMi(int[] arr){
//        int[] arr2 = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            arr2[(arr.length - 1) - i] = ((arr[i] + 5) % 10);
//        }
//        System.out.println("加密后的数据：" + Arrays.toString(arr2));
//
//        return arr2;
//    }
//
////    解密操作
//    public static void jieMi(int[] arr){
//        int[] arr3 = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] < 5){
//                arr3[(arr.length - 1) - i] = (arr[i] + 5);
//            }else{
//                arr3[(arr.length - 1) - i] = (arr[i] - 5);
//            }
//        }
//        System.out.println("解密后的数据：" + Arrays.toString(arr3));
//    }
//
//    end

//    拷贝数组
//    public static void main(String[] args) {
//        int[] v = {12,313,4242,424242,2442};
//        int[] copy = Arrays.copyOf(v, v.length);
//        System.out.println(Arrays.toString(copy));
//
//    }

//    end

//    抢红包
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 4;
//        int c = 3;
//        int d = 2;
//        int e = 1;
//
//        while(true){
//            int i = new Random().nextInt(5);
//            switch (i){
//                case 4:
//                    if(a >= 1){
//                        System.out.println("恭喜获得9元红包");
//                        a--;
//                    }else{
//                        System.out.println("红包已抢完");
//                    }
//                    break;
//                case 3:
//                    if(b >= 1){
//                        System.out.println("恭喜获得666元红包");
//                        b--;
//                    }else{
//                        System.out.println("红包已抢完");
//                    }
//                    break;
//                case 2:
//                    if(c >= 1){
//                        System.out.println("恭喜获得188元红包");
//                        c--;
//                    }else{
//                        System.out.println("红包已抢完");
//                    }
//                    break;
//                case 1:
//                    if(d >= 1){
//                        System.out.println("恭喜获得520元红包");
//                        d--;
//                    }else{
//                        System.out.println("红包已抢完");
//                    }
//                    break;
//                case 0:
//                    if(e >= 1){
//                        System.out.println("恭喜获得9999元红包");
//                        e--;
//                    }else{
//                        System.out.println("红包已抢完");
//                    }
//                    break;
//                default:
//
//                    }
//            if((a == 0) && (b ==0) && (c == 0) && (d == 0) && (e == 0)){
//                System.out.println("你太倒霉了");
//                break;
//            }
//        }
//    }
//    end


//    start
    public static void main(String[] args) {
        Day d = new Day();

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
}
