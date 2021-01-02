package duotaix;

public class test {
    public static void main(String[] args) {
        ailnm na1 = new cat();
        ailnm na2 = new dog();
        ailnm na3 = new element();
        people po = new people();
        // 向上转换，
        po.fet(na3);
        cat cc = (cat)na1;
        // 向下转换
        cc.zhua();
    }
}
