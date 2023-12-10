package dayclass;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * @Auther: YS
 * @Date: 2023/12/10 16:39
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class Movies {

    //电影编号
    private int id;
    //电影名称
    private String name;
    //电影价格
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    //空构造
    public Movies(){};

    //有参构造
    public Movies(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
