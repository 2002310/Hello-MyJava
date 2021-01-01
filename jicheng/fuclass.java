package jicheng;
public class fuclass{
    private int age;
    // 私有的属性不会被继承
    String name;
    public void chi(){
        System.out.println("妖怪会吃人");
        // 所谓继承就是把相同的方法放入一个父类中
        // 需要时可以使用类名 + extends + 父类名来继承父类所有非私有的属性
    }
}