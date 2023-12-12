package dayclass;

/**
 * @Auther: YS
 * @Date: 2023/12/11 22:08
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */

//用户对象
public class Account {
    //用户名
    private String userName;
    //密码
    private double passWord;
    //卡号
    private String cardId;
    //性别
    private String sex;
    //余额
    private double money;
    //每次取款限额
    private double limitMoney;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getPassWord() {
        return passWord;
    }

    public void setPassWord(double passWord) {
        this.passWord = passWord;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimitMoney() {
        return limitMoney;
    }

    public void setLimitMoney(double limitMoney) {
        this.limitMoney = limitMoney;
    }

    public Account() {
    }

    public Account(String userName, double passWord, String cardId, String sex, double money, double limitMoney) {
        this.userName = userName;
        this.passWord = passWord;
        this.cardId = cardId;
        this.sex = sex;
        this.money = money;
        this.limitMoney = limitMoney;
    }
}
