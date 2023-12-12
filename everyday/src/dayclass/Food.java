package dayclass;

import javax.swing.*;

/**
 * @Auther: YS
 * @Date: 2023/12/11 20:50
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class Food {
    private String name;
    private double price;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Food(){};

    public Food(String name, double price, String desc){
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public void descFood(){
        System.out.println("菜名：" + name);
        System.out.println("价格：" + price);
        System.out.println("描述：" + desc);
    }



}
