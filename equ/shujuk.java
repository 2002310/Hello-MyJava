package equ;

import java.util.Scanner;

public class shujuk {
    String name = "2314634dajlijd";
    String password = "29038198";
    public void singin(){
        int a,c = 0;
        do{
            Scanner sn = new Scanner(System.in);
            System.err.println("�������˺�");
            String name = sn.nextLine(); 
            System.out.println("����������");
            String password = sn.nextLine();
            if(name.equals(this.name)&&password.equals(this.password)){
                // equals�ж������Ƿ���ͬ
                System.out.println("���ݿ�������");
                try{
                    System.out.println("����������");
                    Thread.sleep(3 * 1000);
                }catch(InterruptedException e){
                }
                System.out.println("���ӳɹ�");
                a=11;
            }
            else{
                a=0;
                c++;
                if(c == 3){
                    System.out.println("���������������Ѿ��ﵽ���Σ�����������");
                    break;
                }
                System.out.println("����������");
            }
        }while(a<10);
    }
    public static void main(String[] args) {
        shujuk s = new shujuk(); 
        s.singin();
    }
}
