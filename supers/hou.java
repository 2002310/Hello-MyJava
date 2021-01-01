package supers;

public class hou extends fclas{
    String name = "孙悟空";
    public hou(){
        // 默认赠送了一个super();
        // 如果父级构造器中有参数，则需要手动添加super(参数);
        super();
    }
    // 要访问父级的同名属性需要使用super.同名属性；
    public void chi(){
        System.out.println(super.name+"在吃东西");
    }
    public static void main(String[] args) {
        hou h = new hou();
        h.chi();
    }
}
