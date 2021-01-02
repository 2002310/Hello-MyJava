package functioncxhfg;

public class lsm extends liyuan{
    public void jiang(){
        super.jiang();
        System.out.println("李世民也想建立一个自己的国家");
    }
    // 方法的重写，在子类中命名一个与父类一模一样的方法，并重新赋予功能，这样就重写了方法，
    // 如果重写了方法还要访问父类的方法，那么就需要super关键字来访问
    public static void main(String[] args) {
        lsm li = new lsm();
        li.jiang();
    }
}
