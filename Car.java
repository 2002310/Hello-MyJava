public class Car {
    String color;
    int speet;
    int seat = 5;
    // ��Ϊ���ԺͶ���������ָ����ʲô������ָ���ܸ�ʲô
    public void run(){
        System.out.println("The car can run");
    }
    public void fly(){
        seat = 1;
        color = "greed";
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "red";
        c.speet = 180;
        c.seat = 6;
        System.out.println(c.color + "\n" + c.seat + "\n" +c.speet);
        c.run();
        c.fly();
        System.out.println(c.color + "\n" + c.seat + "\n" +c.speet);
    }
}
