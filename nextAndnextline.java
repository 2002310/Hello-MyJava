import java.util.Scanner;

public class nextAndnextline {
    public static void main(String[] args) {
       /*  Scanner hels= new Scanner(System.in);
        System.out.println("������һ���ַ����м䲻���пո�");
        String a = hels.next();
        System.out.println("������һ���ַ����м�����пո�");
        String b = hels.nextLine();
        System.out.println(a);
        System.out.println(b); */
        Scanner sn = new Scanner(System.in);
        System.out.println("����������");
        String name = sn.next();
        System.out.println("������ѧ��");
        int studetid;
        while(sn.hasNextLine()){
            if(sn.hasNextLine()){
                studetid = sn.nextInt();
                System.out.println("���������:"+name+"���ѧ����"+studetid);
                break;
            }else{
                System.out.println("�������������ѧ�ţ�ѧ��ֻ��Ϊ����");
            }
        }
    }
}
