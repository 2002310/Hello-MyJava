package equ;

import java.util.Scanner;

public class shujuk {
    String name = "2314634dajlijd";
    String password = "29038198";
    public void singin(){
        int a,c = 0;
        do{
            Scanner sn = new Scanner(System.in);
            System.err.println("请输入账号");
            String name = sn.nextLine(); 
            System.out.println("请输入密码");
            String password = sn.nextLine();
            if(name.equals(this.name)&&password.equals(this.password)){
                // equals判断内容是否相同
                System.out.println("数据库连接中");
                try{
                    System.out.println("正在连接中");
                    Thread.sleep(3 * 1000);
                }catch(InterruptedException e){
                }
                System.out.println("连接成功");
                a=11;
            }
            else{
                a=0;
                c++;
                if(c == 3){
                    System.out.println("您的输入错误次数已经达到三次，请重启程序");
                    break;
                }
                System.out.println("请重新输入");
            }
        }while(a<10);
    }
    public static void main(String[] args) {
        shujuk s = new shujuk(); 
        s.singin();
    }
}
