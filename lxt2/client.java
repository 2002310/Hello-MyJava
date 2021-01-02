package lxt2;

public class client {
    public static void main(String[] args) {
        game a1 = new cs();
        game a2 = new lol();
        game a3 = new dnf();
        player b1 = new player();
        b1.happy(a1);
        b1.happy(a2);
        b1.happy(a3);
    }
}
