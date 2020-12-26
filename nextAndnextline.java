import java.util.Scanner;

public class nextAndnextline {
    public static void main(String[] args) {
       /*  Scanner hels= new Scanner(System.in);
        System.out.println("请输入一串字符，中间不能有空格");
        String a = hels.next();
        System.out.println("请输入一串字符，中间可以有空格");
        String b = hels.nextLine();
        System.out.println(a);
        System.out.println(b); */
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sn.next();
        System.out.println("请输入学号");
        int studetid;
        while(sn.hasNextLine()){
            if(sn.hasNextLine()){
                studetid = sn.nextInt();
                System.out.println("你的姓名是:"+name+"你的学号是"+studetid);
                break;
            }else{
                System.out.println("请重新输入你的学号，学号只能为数字");
            }
        }
    }
}
