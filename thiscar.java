public class thiscar {
    String color;
    int seat = 5;
    int speet;
    public void run(String color){
        System.out.println("The car can run" + "\nThe car's color is " + this.color); 
        // this��ָ�����Եģ��������this����ô���ͻ����ȴӷ�����Ѱ�Ҳ�����
        // ���ǣ����������û�������������ôthis������Ҳ���ᱨ��Ҫ����ע��
    }
    public static void main(String[] args) {
        thiscar c = new thiscar();
        c.color = "red";
        c.run("yellow");
    }
}
