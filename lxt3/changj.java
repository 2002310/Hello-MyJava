package lxt3;

import java.util.Scanner;

public class changj {
    public static void main(String[] args) {
        System.out.println("请选择你要链接的数据库(1.mysql  2.orcol)");
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        sn.close();
        choux dao;
        if(a == 1){
            dao = new mysql();
        }
        else{
            dao = new orcol();
        }
        dao.contnew();
        dao.jia();
        dao.jian();
        dao.gai();
        dao.cha();
    }
}
