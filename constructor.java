public class constructor {
    int seat = 5;
    String color;
    int speet;
    public constructor(String color,int speet){
        this.color = color;
        this.speet = speet;
        System.out.println(this.color+"\n"+this.speet);
        // ���췽�����ǿ����Լ����������Ȼ�����û������ֵ���й��췽���ڵĲ���
        // java�����͸�ÿ����һ��Ĭ���޲����Ĺ��췽��
        // �����Ƕ����˹��췽�������Ͳ�������
    }
    public static void main(String[] args) {
        constructor c1 = new constructor("��ɫ", 180);
        constructor c2 = new constructor("��ɫ", 120);
        // �����Ƕ������ʱ�򣬾͵���ֱ��ִ���˹��췽����
    }
}
