package dayclass;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: YS
 * @Date: 2023/12/11 22:17
 * @Description: IntelliJ IDEA
 * @Version: 1.0
 */
public class ATM {
    //存放用户对象
    private ArrayList<Account> userList = new ArrayList<>();

    public ArrayList<Account> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<Account> userList) {
        this.userList = userList;
    }

    public ATM() {
    }

    public ATM(ArrayList<Account> userList) {
        this.userList = userList;
    }

    //开始菜单界面
    public void atmMenu(){
        while (true){
            System.out.println("欢迎进入ATM系统：--------");
            System.out.println("菜单：");
            System.out.println("1、用户登录");
            System.out.println("2、用户注册");
            System.out.println("3、退出");
            System.out.println("请输入你的命令：");

            int i = new Scanner(System.in).nextInt();

            switch (i){
                case 1 : userLogin();
                    break;
                case 2 : reqUser();
                    break;
                case 3 :
                    return;
                default:
                    return;
            }
        }

    }

    //检测是否存在用户
    public void deleteUser(){
        //判断用户有无
        if(userList.isEmpty()){
            System.out.println("当前系统无用户------------");
            atmMenu();
        }else{
//            no thing
        }
    }

    //开户系统
    public void reqUser(){
        System.out.println("------欢迎开户------");
        Account ac = new Account();

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String userName = sc.next();

        System.out.println("请输入密码：");
        double passWord = sc.nextDouble();
        passWord = miMaYanZheng(passWord, sc);

        System.out.println("请输入用户性别：");
        String sex = sc.next();
        sex = userSexYanZheng(sex, sc);

        System.out.println("请输入取款限额：");
        double limitMoney = sc.nextDouble();

        double money = 0;

        String cardId = creatCaptcha();
        Account account = new Account(userName, passWord, cardId, sex, money, limitMoney);
        userList.add(account);

        System.out.println("------开户成功------");
        System.out.println("用户名：" + userName + "\n" + "性别：" + sex + "\n"
                +  "卡号：" + cardId + "\n" +  "用户余额：" + money + "\n" +  "取款限额：" + limitMoney);

    }

    //密码验证
    public double miMaYanZheng(double password, Scanner sc){
        for (int i = 0; i < 3 ; i++) {
            System.out.println("验证密码，请第二次输入密码：");
            double v = sc.nextDouble();
            if(v == password){
                break;
            }else {
                System.out.println("验证密码错误，请重新输入密码：");
            }
        }
        return password;
    }

    //性别验证
    public String userSexYanZheng(String sex, Scanner sc){
        for (int i = 0; i < 3; i++) {
            if((sex.equals("男")) || (sex.equals("女"))){
                break;
            }else{
                System.out.println("性别异常，请重新输入性别：");
                sex = sc.next();
            }
        }
        return sex;
    }


    //创造验证码
    public String creatCaptcha(){
        String s = "";
        for (int i = 0; i < 8; i++) {
            int a = new Random().nextInt(10);
            s += a;
        }

        //判断卡号是否重复
        Iterator<Account> it = userList.iterator();
        while(it.hasNext()){
            if(s.equals(it.next().getCardId())){
                s = creatCaptcha();
            }else{
                break;
            }
        }
        return s;
    }

    //用户登录
    public void userLogin(){
        //验证是否存在用户
        deleteUser();

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入卡号：");
            String cardId = new Scanner(System.in).next();

            Account acc = getAccByCardId(cardId);

            if (acc != null){
                //登录成功
                login(acc);
                return;
            }else{
//                登录失败
                System.out.println("用户不存在，请重新输入卡号");
            }
        }

//        输入密码错误过多
        System.out.println("卡号输入次数过多，等会再用");
        atmMenu();

//        Iterator<Account> it = userList.iterator();
//        for (int i = 0; i < 3; i++) {
//            System.out.println("请输入卡号：");
//            String cardId = new Scanner(System.in).next();
//            while(it.hasNext()){
//                if(cardId.equals(it.next().getCardId())){
//                    //登录成功，返回用户操作界面
//
//                }else{
////                    no thing
//                }
//                System.out.println("用户不存在");
//            }
//
//        }
//        System.out.println("卡号输入次数过多，等会再用");
//        atmMenu();

    }

    //根据卡号搜索用户
    public Account getAccByCardId(String cardId){

        for (int i = 0; i < userList.size(); i++) {
            if(cardId.equals(userList.get(i).getCardId())){
                return userList.get(i);
            }else {
//                no thing
            }
        }

        return null;
    }

    //登录成功的界面
    public void login(Account acc){
        System.out.println("------欢迎" + acc.getUserName() + "使用ATM系统------");

        System.out.println("1、查询账户");
        System.out.println("2、存款");
        System.out.println("3、取款");
        System.out.println("4、转账");
        System.out.println("5、修改密码");
        System.out.println("6、退出");
        System.out.println("7、注销账号");
        System.out.println("请选择：");

        int i = new Scanner(System.in).nextInt();

        switch (i){
            //查询账户
            case 1 :showUser(acc);
                break;
             //存款
            case 2 :
                break;
             //取款
            case 3 :
                break;
             //转账
            case 4 :
                break;
             //修改密码
            case 5 :
                break;
             //退出
            case 6 :
                return;
             //注销账号
            case 7 :
                break;
            default:
                break;
        }

    }

    //查询账号
    public void showUser(Account acc){
        System.out.println("用户名：" + acc.getUserName());
        "卡号：" + 
    }

    //

    //

    //

    //

    //

    //

    //

    //

    //

    //


}
