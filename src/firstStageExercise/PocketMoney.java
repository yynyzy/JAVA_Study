package firstStageExercise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PocketMoney {
    private String detail = "==============零钱通============";
    private double balance = 0;
    private boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    Date date = null;
    SimpleDateFormat sft = new SimpleDateFormat("yyyy-MM-dd HH:SS");
    public void showMenu(){
        do {
            System.out.println("==============零钱通============");
            System.out.println("\t\t\t请输入一下数字进行选择：");
            System.out.println("\t\t\t1.展示零钱明细");
            System.out.println("\t\t\t2.入账");
            System.out.println("\t\t\t3.支出");
            System.out.println("\t\t\t4.退出");
            String key  = "";
            key = scanner.next();
            switch (key){
                case "1":
                    this.showPocketMoneyDetail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:

                    break;
            }
        }while (loop);

    }

    private void showPocketMoneyDetail(){
        System.out.println("当前明细为：");
        System.out.println("账户余额：" + balance);
    }

    private void income(){
        System.out.println("请输入你的收入金额：");
        double money = 0;
        money = scanner.nextDouble();
        if(money<0){
            System.out.println("请输入在大于 0 的金额!");
            return;
        }
        balance += money;
        String detail = "收入金额" + money + "总收入" + balance;
        System.out.println(detail);
    }

    private void pay(){
        System.out.println("请输入你的支出金额：");
        double money = 0;
        money = scanner.nextDouble();
        if(money<0 || money > balance){
            System.out.println("请输入在0 ~ "+ balance + "的金额!");
            return;
        }
        balance -= money;
        String note = "支出金额" + "-" + money + "总收入" + balance;
        System.out.println(note);
    }

    private void exit(){
        while (true){
            System.out.println("输入y/n");
            String choice = "";
            choice = scanner.next();
            if(choice.equals("y")){
                loop = false;
                break;
            }
            if (choice.equals("n")) {
                break;
            }
            System.out.println("输入错误！");
        }
    }
}
