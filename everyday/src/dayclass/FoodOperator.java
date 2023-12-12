package dayclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Auther: YS
 * @Date: 2023/12/11 21:12
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class FoodOperator {
    private ArrayList<Food> foodlist = new ArrayList<>();

    public ArrayList<Food> getFoodlist() {
        return foodlist;
    }

    public void setFoodlist(ArrayList<Food> foodlist) {
        this.foodlist = foodlist;
    }

    public FoodOperator(ArrayList<Food> foodlist) {
        this.foodlist = foodlist;
    }

    public FoodOperator() {
    }

    //添加菜品
    public void foodAdd(){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入菜名：");
        String foodname = sc.next();

        System.out.println("请输入价格：");
        double foodprice = sc.nextDouble();

        System.out.println("请输入菜品描述：");
        String fooddeac = sc.next();

        Food food = new Food(foodname, foodprice, fooddeac);

        foodlist.add(food);

    }

    //查询菜单
    public void foodShow(){
        Iterator<Food> it = foodlist.iterator();
        while(it.hasNext()){
            it.next().descFood();
        }

    }

    //菜单
    public void foodMenu(){

        while(true){
            System.out.println("菜单：");
            System.out.println("1、添加菜单");
            System.out.println("2、查询菜单");
            System.out.println("3、退出");

            int i = new Scanner(System.in).nextInt();

            switch(i){
                case 1 : foodAdd();
                    break;
                case 2 : foodShow();
                    break;
                default:
                    return; //break只能跳出最近的一个循环，例如这次，只能跳出switch，但是不能跳出while，因此可以用return，直接结束方法
            }
        }
    }


}
