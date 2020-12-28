public class constructor {
    int seat = 5;
    String color;
    int speet;
    public constructor(String color,int speet){
        this.color = color;
        this.speet = speet;
        System.out.println(this.color+"\n"+this.speet);
        // 构造方法就是可以自己定义参数，然后用用户输入的值进行构造方法内的操作
        // java会赠送给每个类一个默认无参数的构造方法
        // 当我们定义了构造方法后，它就不会赠送
    }
    public static void main(String[] args) {
        constructor c1 = new constructor("黄色", 180);
        constructor c2 = new constructor("绿色", 120);
        // 当我们定义类的时候，就等于直接执行了构造方法；
    }
}
