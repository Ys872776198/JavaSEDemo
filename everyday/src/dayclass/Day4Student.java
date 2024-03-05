package dayclass;

/**
 * @Auther: YS
 * @Date: 2024/3/5 12:11
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class Day4Student {
    //学生信息
//    姓名
    private String name;
//    性别
    private String sex;
//    成绩
    private int sco;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSco() {
        return sco;
    }

    public void setSco(int sco) {
        this.sco = sco;
    }

    public Day4Student() {

    }

    public Day4Student(String name, String sex, int sco) {
        this.name = name;
        this.sex = sex;
        this.sco = sco;
    }

    public void showStudent(){
        System.out.println("姓名：" + this.name + "\t" + "性别：" + this.sex + "\t" + "成绩：" + this.sco);
    }


}
