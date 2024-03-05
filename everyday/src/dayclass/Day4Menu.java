package dayclass;

import java.util.Scanner;

/**
 * @Auther: YS
 * @Date: 2024/3/5 11:54
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class Day4Menu {
//    菜单
    public void classMenu(){
        //創建全部学生信息
        Day4Students ds = new Day4Students();

        while(true){
            System.out.println("请选择功能；");
            System.out.println("1、查看全部学生信息");
            System.out.println("2、查看男学生信息");
            System.out.println("3、查看女学生信息");
            System.out.println("4、查看全班平均分");
            System.out.println("5、查看全班平均分（去掉最高分，最低分）");
            System.out.println("6、退出");

            int i = new Scanner(System.in).nextInt();

            switch(i){
//                查看全部学生信息
                case 1 : ds.showStudent();
                    break;
//                    查看男生信息
                case 2 : ds.showBoys();
                    break;
//                    查看女生信息
                case 3 : ds.showGirls();
                    break;
//                    查看全班平均分
                case 4 : ds.showAve();
                    break;
//                查看全班平均分（去掉最高分，最低分）
                case 5 : ds.showAveMinMax();
                    break;
//                    退出
                case 6 :
                    return;
                default :
                    System.out.println("输入错误，请重新输入！！");
                    break;
            }

        }

    }


}
