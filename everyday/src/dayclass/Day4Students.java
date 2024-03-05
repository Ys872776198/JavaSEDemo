package dayclass;

import dayinterface.Day4AveSco;
import dayinterface.Day4StudentInfo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: YS
 * @Date: 2024/3/5 11:52
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class Day4Students extends Day4Student implements Day4AveSco, Day4StudentInfo {

    private ArrayList<Day4Student> arr = new ArrayList();

    public ArrayList<Day4Student> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Day4Student> arr) {
        this.arr = arr;
    }

    public Day4Students(){
        arr.add(new Day4Student("11", "男", 66));
        arr.add(new Day4Student("22", "女", 77));
        arr.add(new Day4Student("33", "女", 88));
        arr.add(new Day4Student("44", "男", 67));
        arr.add(new Day4Student("55", "女", 87));
        arr.add(new Day4Student("66", "男", 67));
        arr.add(new Day4Student("77", "男", 87));
        arr.add(new Day4Student("88", "女", 67));
        arr.add(new Day4Student("99", "女", 99));
        arr.add(new Day4Student("1010", "男", 78));
    }

//    显示平均分
    @Override
    public void showAve() {
//        保存总分
        int count = 0;
//        保存平均分
        double ave = 0.0;

        for (int i = 0; i < arr.size(); i++) {
            count += arr.get(i).getSco();
        }

        ave = ((double)count / (double)arr.size());

        System.out.println("总分：" + count);
        System.out.println("平均分：" + ave);
    }

//    显示平均分（去掉最高分，最低分）
    @Override
    public void showAveMinMax() {
//        最大值
        int min = 100;
//        最小值
        int max = 0;
//        临时值
        int temp = 0;
//        保存总分
        int count = 0;
//        保存平均分
        double ave = 0.0;

        for (int i = 0; i < arr.size(); i++) {
            count += arr.get(i).getSco();
            temp = arr.get(i).getSco();
            if(max <= temp){
                max = temp;
            }else{
//                do nothing
            }

            if (min >= temp){
                min = temp;
            }else {
//                do nothing
            }
        }
        System.out.println("min:" + min + "\t" + "max:" + max);

        count = (count - min - max);
        ave = ((double)count / (double)(arr.size() - 2));

        System.out.println("总分：" + count);
        System.out.println("平均分：" + ave);
    }

//    显示学生信息
    @Override
    public void showStudent() {
//        遍历集合
////        1、普通for循环
//        for (int i = 0; i < arr.size(); i++) {
//            arr.get(i).showStudent();
//        }
//        2、增强for循环
        for(Day4Student d4s : arr){
            d4s.showStudent();
        }
////        3、利用迭代器
//        Iterator<Day4Student> it = arr.iterator();
//        while(it.hasNext()){
//            it.next().showStudent();
//        }

    }

//    显示男生信息
    @Override
    public void showBoys() {
        for(Day4Student d4s : arr){
            if(d4s.getSex().equals("男")){
                d4s.showStudent();
            } else  {
//                do nothing
            }
        }
    }

//    显示女生信息
    @Override
    public void showGirls() {
        for(Day4Student d4s : arr){
            if(d4s.getSex().equals("女")){
                d4s.showStudent();
            } else  {
//                do nothing
            }
        }
    }
}
