package supers;

public class hou extends fclas{
    String name = "�����";
    public hou(){
        // Ĭ��������һ��super();
        // ����������������в���������Ҫ�ֶ����super(����);
        super();
    }
    // Ҫ���ʸ�����ͬ��������Ҫʹ��super.ͬ�����ԣ�
    public void chi(){
        System.out.println(super.name+"�ڳԶ���");
    }
    public static void main(String[] args) {
        hou h = new hou();
        h.chi();
    }
}
