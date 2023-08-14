package pers.base.syntax;

import java.util.Arrays;

/**
 * @Auther: YS
 * @Date: 2023/8/14 17:36
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class CommonSyntax {
    public static void main(String[] args) {
//        System.out.println("hello world");

        /*冒泡排序*/
            /* 数组的常见定义方法 */
//                //1:先声明，再初始化，最后使用
//                int[] arr;  //声明 (再 【】 中可以添加数据长度，也可以不添加)
//                arr = null; //初始化
//                arr[0] = 1; //使用
//                arr[1] = 2;

//                //2:先声明，初始化一起完成，最后使用
//                int[] arr = null;   //声明和初始化同时完成 (再 【】 中可以添加数据长度，也可以不添加)
//                arr[0] = 1; //使用
//                arr[1] = 2;

//                 //3:声明，初始化，赋值一步完成 (最常用)
//                int[] arr = new int[]{233, 444, 555, 2222, 333, 4435, 1, 44};
//
//            /*排序算法*/
//                //设置临时变量，
//                int temp = 0;
//
//                //设置外循环
//                for (int i = 0; i < arr.length; i++){
//                    //保存最小值的坐标
//                    int min = i;
//
//                    //设置内循环
//                    for (int j = (i + 1); j < arr.length; j++){
//                        //寻找最小值
//                        if (arr[min] > arr[j]){
//                            min = j;
//                        }else{
//                            /*do nothing*/
//                        }
//                    }
//
//                    //进行数据交换
//                    if (min != i){
//                        temp = arr[i];
//                        arr[i] = arr[min];
//                        arr[min] = temp;
//
//                    }else{
//                        /*do nothing*/
//                    }
//                }
//
//                //输出
//                System.out.println(Arrays.toString(arr));
    }
}
