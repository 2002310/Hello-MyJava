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
        System.out.println(name+"正在攻击"+zw.name);
        zw.hp-=gj;
        System.out.println(zw.name+"还剩下"+zw.hp+"血量");
    }
}
