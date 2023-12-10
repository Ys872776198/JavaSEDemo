package dayclass;

/**
 * @Auther: YS
 * @Date: 2023/11/23 21:54
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class Day {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Day(){}

    public Day(int age, String name){
//        setAge(age);
//        setName(name);

        this.age = age;
        this.name = name;

    }
}
