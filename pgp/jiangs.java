package pgp;

public class jiangs {
    String name;
    int gj;
    int hp;
    public jiangs(String name,int gj,int hp){
        this.name = name;
        this.gj = gj;
        this.hp = hp;
    }
    public void eat(zhiw zw){
        System.out.println(name+"���ڹ���"+zw.name);
        zw.hp-=gj;
        System.out.println(zw.name+"��ʣ��"+zw.hp+"Ѫ��");
    }
}
