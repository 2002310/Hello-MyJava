package pgp;

public class zhiw {
    String name;
    int gj;
    int hp;
    public zhiw(String name,int gj,int hp){
        this.name = name;
        this.gj = gj;
        this.hp = hp;
    }
    public void put(jiangs js){
        System.out.println(name+"正在攻击"+js.name);
        js.hp-=gj;
        System.out.println(js.name+"还剩下"+js.hp+"血量");
    }
}
