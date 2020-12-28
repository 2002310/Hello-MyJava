public class thiscar {
    String color;
    int seat = 5;
    int speet;
    public void run(String color){
        System.out.println("The car can run" + "\nThe car's color is " + this.color); 
        // this是指向属性的，如果不加this，那么它就会优先从方法内寻找参数；
        // 但是，如果方法内没有这个参数，那么this不加他也不会报错，要格外注意
    }
    public static void main(String[] args) {
        thiscar c = new thiscar();
        c.color = "red";
        c.run("yellow");
    }
}
